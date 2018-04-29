FROM python:3-alpine
COPY sa /app
WORKDIR /app
RUN pip3 install -r requirements.txt
RUN python3 -m textblob.download_corpora
EXPOSE 5000
CMD ["python3","sentiment_analysis.py"]
