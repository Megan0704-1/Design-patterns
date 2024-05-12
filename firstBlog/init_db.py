# Utility Script, a setup tool

import os
from extensions import db
from app import create_app
from config import DevelopConfig, TestingConfig, ProductionConfig

env_config = {
        'developement' : DevelopConfig,
        'testing': TestingConfig,
        'production': ProductionConfig
        }

config_name = os.getenv('FLASK_ENV', 'development')
config_class = env_config.get(config_name, DevelopConfig)
app = create_app(config_class)


if __name__ == '__main__':
    with app.app_context():
        print("Initializing Database.")
        db.create_all()
        print('Database initialized.')
