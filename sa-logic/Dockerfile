FROM python:3-alpine
COPY sa /app
WORKDIR /app
RUN pip --proxy=proxy01.ica.se:8080 install -r requirements.txt
RUN http_proxy=proxy01.ica.se:8080 https_proxy=proxy01.ica.se:8080 python -m textblob.download_corpora
EXPOSE 5000
ENTRYPOINT ["python"]
CMD ["sentiment_analysis.py"]