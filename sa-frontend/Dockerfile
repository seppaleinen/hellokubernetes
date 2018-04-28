FROM node:9-alpine
WORKDIR /data
COPY package.json /data/
COPY public src /data/public/
COPY src /data/src/
RUN npm install
RUN npm run build

FROM nginx:1.13-alpine
COPY --from=0 /data/build /usr/share/nginx/html
