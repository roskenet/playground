build:
	./mvnw clean package docker:build -DskipTests=true
push:
	docker push -t roskenet/oxygen:0.0.4
deploy:
	kubectl apply -f deploy/deployment.yaml
