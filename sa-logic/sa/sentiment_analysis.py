from textblob import TextBlob
from flask import Flask, request, jsonify

app = Flask(__name__)


@app.route("/analyse/sentiment", methods=['POST'])
def analyse_sentiment():
    try:
        sentence = request.get_json()['sentence']
        polarity = TextBlob(sentence).sentences[0].polarity
        return jsonify(
            sentence=sentence,
            polarity=polarity
        )
    except Exception as e:
        return repr(e), 500


@app.route("/health", methods=['GET'])
def health():
    return '{"status":"UP"}'


if __name__ == '__main__':
    app.debug = True
    app.run(host='localhost', port=5000)
