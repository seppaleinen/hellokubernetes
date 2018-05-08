# Kubernetes

Install docker, docker-compose and minikube

This is just to try out kubernetes, following [this guide](https://medium.freecodecamp.org/learn-kubernetes-in-under-3-hours-a-detailed-guide-to-orchestrating-containers-114ff420e882)

```bash
# To start services in docker
docker-compose --build up -d

kubectl apply -f resource-manifests/service-*
kubectl apply -f resource-manifests/sa-*

minikube service sa-frontend-lb
```
