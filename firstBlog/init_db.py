from app import create_app, db

app = create_app()

with app.app_context():
    db.create_all()

if __name__ == '__main__':
    print('Initializing the database...')
    db.create_all()
    print('Database initialized.')
