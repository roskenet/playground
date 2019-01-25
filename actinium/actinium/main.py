from flask import Flask

app = Flask(__name__)

@app.route("/")
def hello():
    return '''
        <html>
          <head>
            <title>Hello World!</title>
          </head>
          <body>
            <h1>Hello World!</h1>
            <p>When you can read this... Actinium is running!</p>
          </body>
        </html>'''

def main():
    app.run(host='0.0.0.0')
