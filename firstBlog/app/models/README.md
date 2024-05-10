A study of app database

- SQLAlchemy
> In the code, the db object is imported from app, this is my ORM (object relational mapper).
> This allows me to interact with the database using Python code instead of SQL.

- Model Classes
> All the classes defined in the code are inherits from `db.Model` class, making them a part of SQLAlchemy ORM framework

1. `User`
- an id key
- an username column (unique)
- a password column (not null)

- relationships
    - `db.relationship` is used to define the relationship between models, `back_populates` is used on both side of the references to ensure they are aware of each other.


