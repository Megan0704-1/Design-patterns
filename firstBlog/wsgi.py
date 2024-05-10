'''
Entry point of My Blog

Note. before running the app, please set the environment variable: export FLASK_ENV=development/test/production
'''

import os
from app import create_app, DevelopConfig, TestingConfig, ProductionConfig

env_config = {
        'development': DevelopConfig,
        'testing': TestingConfig,
        'production': ProductionConfig,
        }

config_name = os.getenv("FLASK_ENV", 'development')
config_class = env_config.get(config_name, DevelopConfig)
app = create_app(config_class = config_class)


if __name__ == '__main__':
    app.run()
