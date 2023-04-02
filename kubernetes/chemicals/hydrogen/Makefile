all: push

package:
	./mvnw clean install package

build: package
	./mvnw docker:build

push: build
	./mvnw docker:push
