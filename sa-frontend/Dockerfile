FROM node:9-alpine
WORKDIR /data
COPY package.json public/ src/ /data
RUN npm --proxy http://proxy01.ica.se:8080/ --https-proxy http://proxy01.ica.se:8080/ install && npm run build

FROM nginx
COPY --from=0 /data/build /usr/share/nginx/html
COPY build /usr/share/nginx/html