curl -d 'grant_type=client_credentials' -u simple-client:c0dba145-1cce-4775-be90-5909094bb361 -X POST http://localhost:8080/auth/realms/demo/protocol/openid-connect/token | jq .
