FROM node:9-alpine
WORKDIR /data
COPY package.json /data/
COPY public src /data/public/
COPY src /data/src/
RUN npm install

RUN find . -type f | grep -v node_modules
RUN npm run build

FROM nginx
COPY --from=0 /data/build /usr/share/nginx/html
