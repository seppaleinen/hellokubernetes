FROM node:9-alpine
WORKDIR /data
COPY package.json /data/
COPY public src /data/public/
COPY src /data/src/
RUN npm --proxy http://proxy01.ica.se:8080/ --https-proxy http://proxy01.ica.se:8080/ install

RUN find . -type f | grep -v node_modules
RUN npm run build

FROM nginx
COPY --from=0 /data/build /usr/share/nginx/html
COPY build /usr/share/nginx/html