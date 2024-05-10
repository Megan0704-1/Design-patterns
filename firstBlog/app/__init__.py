from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from flask_login import LoginManager
from config import DevelopConfig, TestingConfig, ProductionConfig
from flask import redirect, url_for

db = SQLAlchemy()
login_manager = LoginManager()

def create_app(config_class):
    app = Flask(__name__)
    app.config.from_object(config_class)

    db.init_app(app)
    login_manager.init_app(app)

    from .auth import auth as auth_blueprint
    app.register_blueprint(auth_blueprint, url_prefix="/auth")
    from .blog import blog as blog_blueprint
    app.register_blueprint(blog_blueprint, url_prefix="/blog")

    @app.route('/')
    def home():
        return redirect(url_for('blog.index'))

    return app
