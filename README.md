# Voting Spring Boot Application

## Tech Stack
- Java 17
- Spring Boot 3.x
- Gradle
- Docker

## Ports
- Application Port: **8080**

## API Endpoints

### Add Candidate
POST /api/candidates?name=Alice

### Vote
POST /api/vote/{candidateId}

### Results
GET /api/results

## Run Locally
./gradlew bootRun

## Build Jar
./gradlew build

## Docker Build
docker build -t voting-app .

## Docker Run
docker run -p 8080:8080 voting-app

DOCKER TAG: mesivayenduri/voting-app:tagname

 kubectl -n dev port-forward service/voting-dev 8080:8080

 curl -X POST "http://127.0.0.1:8080/api/candidates?name=Alice"

 curl -X POST "http://127.0.0.1:8080/api/vote/1"

 
