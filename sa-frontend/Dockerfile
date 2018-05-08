FROM node:9-alpine
WORKDIR /data
COPY package.json /data/
COPY public /data/public/
COPY src /data/src/
ENV WEBAPP_URL ${WEBAPP_URL}
RUN npm --proxy http://proxy01.ica.se:8080/ --https-proxy http://proxy01.ica.se:8080/ install
RUN npm run build

FROM nginx:1.13-alpine
ENV WEBAPP_URL ${WEBAPP_URL}
COPY --from=0 /data/build /usr/share/nginx/html
