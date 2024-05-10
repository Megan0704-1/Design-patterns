'''
Configurations for the Flask app
1. SECRET_KEY: a key used by flask and its extension to keep data safe. -> For crytographically sign cookies and security-related needs.
2. SQLALCHEMY_DATABASE_URI: [string] Used by the SQLAlchemy ORM to connect to the database.
    FORMAT of the URI: `dialect+driver://username:password@host:port/database`
3. SQLALCHEMY_TRACK_MODIFICATIONS: [bool] Used to signal the app everytime a change is about to be made in the database.
    (FALSE turns off the feature and improve performance and reduce memory usage)
4. DEBUG and TESTING: [bool] These settings are part of Flask configuration and establish different mode.
'''
class Config:
    SECRET_KEY = "FayetteStreet"
    SQLALCHEMY_DATABASE_URI = "sqlite:///blog.db"
    SQLALCHEMY_TRACK_MODIFICATIONS = False

class DevelopConfig(Config):
    DEBUG = True

class TestingConfig(Config):
    TESTING = True
    SQLALCHEMY_DATABASE_URI = "sqlite:///test.db"

class ProductionConfig(Config):
    DEBUG = False
