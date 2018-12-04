curl -d 'grant_type=client_credentials' \
-u simple-client:c0dba145-1cce-4775-be90-5909094bb361 \
-X POST http://auth-service:8080/auth/realms/demo/protocol/openid-connect/token | jq .

curl -H "Authorization: Bearer $TOKEN" simple-service:8082/ 

curl -H "Authorization: Bearer $TOKEN" localhost:8082/ 
