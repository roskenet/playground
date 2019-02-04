# Authentication with Spring Boot, Angular 2 and Keycloak

- Stolen from:
http://slackspace.de/articles/authentication-with-spring-boot-angular-2-and-keycloak/

- Make sure to start Keycloak before using the application
- First start the backend application and after that the frontend application

## Run backend

To run the project with embedded Tomcat by maven:

    cd backend
    mvn spring-boot:run
    
## Run frontend

To run the project with development server:
    
    cd frontend
    npm install
    ng serve
    
Then navigate to http://localhost:4200 to see the application in action.


