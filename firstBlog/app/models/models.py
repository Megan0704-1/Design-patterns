'''
models for the app
1. Users
2. Post
3. Profile
4. Comment
5. Tags
6. Likes


In SQLAlchemy, ORM tool with Flask, the table relationships are managed through constructs like `relationship`, `backref` and `back_populates`
-> For setup and mapped foreign key relationships between models
    - relationship: used to define the interaction between models at the ORM level
    - back_populates: an option used in the `relationship` function for establishing bidirectional relationship in SQLAlchemy
    - backref: another option to establish bidirectional relationships, without having to define the back populates in the referenced model.

'''

from app import db
from flask_login import UserMixin


# User Model for storing user info
class User(UserMixin, db.Model):
    '''
    User is a model class, inherits from UserMixin and db.Model.
    fields:
        - id: defines an `id` column in the user table
        - username: defines a username column in the user table (not null)
        - password: defines a password column in the user table (not null)
    '''
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(100), unique=True, nullable=False)
    password = db.Column(db.String(100), nullable=False)

    post = db.relationship('Post', back_populates='user')
    profile = db.relationship('Profile', back_populates='user', uselist=False)
    comments = db.relationship('Comment', back_populates='user')
    likes = db.relationship('Like', back_populates='user')

# Post Model for storing post contents
class Post(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(100), nullable=False)
    content = db.Column(db.Text, nullable=False)
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'))
    comments = db.relationship('Comment', back_populates='post')

    user = db.relationship('User', back_populates='post')
    likes = db.relationship('Like', back_populates='post')

# Profile Model for storing profile info
class Profile(db.Model):
    '''
    Profile information
    fields:
        - bio
        - profile image
        - twitter, instagram links
    '''
    id = db.Column(db.Integer, primary_key=True)
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'), unique=True)
    bio = db.Column(db.Text)
    profile_image = db.Column(db.String(255))
    twitter_handle = db.Column(db.String(255))
    instagram_handle = db.Column(db.String(255))

    user = db.relationship('User', back_populates='profile')


class Comment(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    content = db.Column(db.Text, nullable=False)
    post_id = db.Column(db.Integer, db.ForeignKey('post.id'))
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'))

    post = db.relationship('Post', back_populates='comments')
    user = db.relationship('User', back_populates='comments')


class Like(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    post_id = db.Column(db.Integer, db.ForeignKey('post.id'))
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'))

    post = db.relationship('Post', back_populates='likes')
    user = db.relationship('User', back_populates='likes')
