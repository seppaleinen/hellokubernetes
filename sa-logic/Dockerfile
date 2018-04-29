FROM python:3-alpine
COPY sa /app
WORKDIR /app
RUN pip3 --proxy=proxy01.ica.se:8080 install -r requirements.txt
RUN http_proxy=proxy01.ica.se:8080 https_proxy=proxy01.ica.se:8080 python3 -m textblob.download_corpora
EXPOSE 5000
CMD ["python3","sentiment_analysis.py"]
