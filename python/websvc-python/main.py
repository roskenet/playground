from flask import Flask
from hello_websvc import hello

app = Flask(__name__)


@app.route('/')
def index():
    return hello.hello_world('World')


if __name__ == '__main__':
    app.run(debug=True)
