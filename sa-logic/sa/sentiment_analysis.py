from textblob import TextBlob
from flask import Flask, request, jsonify

app = Flask(__name__)


@app.route("/analyse/sentiment", methods=['POST'])
def analyse_sentiment():
    print("HEJ")
    sentence = request.get_json()['sentence']
    print("SENTENCE: " + sentence)
    polarity = TextBlob(sentence).sentences[0].polarity
    print("POLARITY: " + polarity)
    return jsonify(
        sentence=sentence,
        polarity=polarity
    )


@app.route("/health", methods=['GET'])
def health():
    return jsonify('{"status":"UP"}')


if __name__ == '__main__':
    app.run(host='localhost', port=5000)
