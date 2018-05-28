export PATH=/home/felix/Packages/java-8/bin:$PATH
./mvnw clean install
eval $(minikube docker-env)
docker build -t roskenet/discovery:1.3.0 .
kubectl delete deployment discovery-depl
kubectl create -f deploy/deployment.yaml
