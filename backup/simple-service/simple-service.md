# OAuth token for simple-service

Start keycloak.

```console
curl http://192.168.99.100:30111/auth/realms/minikube/.well-known/openid-configuration | jq .
```

Get a token:

```console
curl -i -d 'grant_type=client_credentials' -u simple-service:82561a8b-e4f7-4658-bcc5-ad6edc5ba5dc -X POST http://192.168.99.100:30111/auth/realms/minikube/protocol/openid-connect/token
```

Call simple-service (with a token for himself):

```console
Authorization: Bearer $TOKEN
```
