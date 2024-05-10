__init__.py code breakdown

- Class Import
    1. Flask: import a Flask class to create a Flask application.
    2. SQLAlchemy: an ORM (Object relational mapper) for Flask, used to interact with databases (SQL syntax is abstracted as python OOP syntax).
    3. LoginManager: Used to manage user sessions for authentication purposes.

- Initialization
    Create instances of Flask application, SQLAlchemy, and LoginManager classes.

- Logic for creating app
    1. Loads the config from package
    2. Initializes the SQLAlchemy with Flask app (for handling database operations)
    3. Initializes the LoginManager with Flask app (for handling login functionalities)

- Register BluePrint
    1. Import `auth` blueprint (handles login and logout)
    2. Import `blog` blueprint (handles posting articles)

