from . import blog
from flask import render_template, request, redirect, url_for, flash
from flask_login import login_required, current_user
from app import db
from app.models.models import Post

# Home
@blog.route('/')
def index():
    posts = Post.query.all()
    return render_template('index.html', posts = posts)


# Create new Post
@blog.route('/post/new', methods=['GET', 'POST'])
@login_required
def new_post():
    if request.method == 'POST':
        post_title = request.form.get('title')
        post_body = request.form.get('body')
        new_post = Post(title = post_title, body = post_body, user_id = current_user.id)
        db.session.add(new_post)
        db.session.commit()
        flash('Post successfully created!')
        return redirect(url_for('blog.index'))
    return render_template('new_post.html')

# Find post
@blog.route('/post/find', methods=['GET', 'POST'])
@login_required
def find_post():
    post_id = request.args.get('post_id')
    post = None
    if post_id:
        post = Post.query.get(post_id)
    return render_template('view_post.html', post = post)

# View post
@blog.route('/post/<int:post_id>', methods = ['GET'])
def view_post(post_id):
    '''
    View a specific post
    '''
    post = Post.query.get_or_404(post_id)
    return render_template('view_post.html', post = post)


# Edit post
@blog.route('/post/<int:post_id>/edit', methods = ['GET', 'POST'])
@login_required
def edit_post(post_id):
    '''
    Edit a specific post.
    '''
    post = Post.query.get_or_404(post_id)
    if current_user.id != post.user.id:
        flash("You are not authorized to edit this post.")
        return redirect(url_for("blog.view_post", post_id=post.id))

    if request.method == 'POST':
        if 'title' in request.form and 'body' in request.form:
            post.title = request.form['title']
            post.body = request.form['body']
            db.session.commit()
            flash("Post Update!")
            return redirect(url_for("blog.view_post", post_id = post.id))
        else:
            flash("Error: All form fields are required.")

    return render_template('edit_post.html', post = post)


# Delete Post
@blog.route('/post/<int:post_id>/delete', methods = ['POST'])
@login_required
def delete_post(post_id):
    '''
    Delete a specific post.
    '''
    post = Post.query.get_or_404(post_id)
    if(post):
        db.session.delete(post)
        db.session.commit()
        flash("Post deleted!")
    return redirect(url_for('blog.index'))
