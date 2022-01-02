# Chemicals

A mixture of canned microserviced in a fat free soup.

## Service gateway

The trojan horse inside your minikube cluster.

```sh
kubectl apply -f servicepod/pod.yaml
```

```sh
kubectl exec -it servicepod -- /bin/bash
```

## PostgreSQL

```sh
kubectl apply -f postgres/postgres-configmap.yaml
kubectl apply -f postgres/postgres-storage.yaml
kubectl apply -f postgres/postgres-deployment.yaml
kubectl apply -f postgres/postgres-service.yaml
```

## Keycloak

Create the database:

```sql
CREATE ROLE keycloak LOGIN PASSWORD 'keycloak';
CREATE DATABASE keycloak OWNER keycloak;
```

```sh
kubectl apply -f keycloak/keycloak-deployment.yaml
kubectl apply -f keycloak/keycloak-service.yaml
kubectl apply -f keycloak/keycloak-ingress.yaml
```
