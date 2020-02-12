# docker-springboot-mysql
Simple Springboot Application Wrapped into Docker and Connected to Mysql Wrapped into Docker as Well

### Mysql Docker
1. Setup MYSQL as Docker Application
```sh
    docker pull mysql:8
```
2. Create Container based on mysql:8 image
```sh
    docker container create --name mysqlserver1 -p 3306:3306 -e="MYSQL_ROOT_PASSWORD=P@ssw0rd" -e="MYSQL_DATABASE=employee" -e="MYSQL_ROOT_HOST=%" mysql:8
```
3. Start mysql container
```sh
    docker container start mysqlserver1
```
### SpringBoot Docker
1. Build image
```sh
    docker build --tag docker-springboot:1.0 .
```
2. Create Container from docker-springboot:1.0 image
```sh
    docker container create --name docker-springboot-app docker-springboot:1.0 -p 8080:8080
```
3. Start Container
```sh
    docker container start docker-springboot-app
```