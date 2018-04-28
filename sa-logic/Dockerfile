FROM python:3-alpine
COPY sa /app
WORKDIR /app
RUN pip install -r requirements.txt
RUN python -m textblob.download_corpora
EXPOSE 5000
ENTRYPOINT ["python","sentiment_analysis.py"]
