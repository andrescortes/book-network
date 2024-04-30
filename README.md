
# Book Network

A spring boot app that includs Spring Security and JWT


## Acknowledgements

 - [Spring Boot](https://spring.io/projects/spring-boot)
 - [Spring Data JPA](https://spring.io/projects/spring-data)
 - [Spring Security](https://spring.io/projects/spring-security)
 - [JWT](https://jwt.io/)


## Appendix

How to handle request with authorization, generate and refresh token and how to create filter custom to handle security manager


## Authors

- [@andrescortes](https://github.com/andrescortes)


## API Reference

#### Post login

```http
  POST /api/v1/auth/login
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Authorization` | `string` | **Required**. Your token |

Takes email, password and returns a json with a new token.

#### Post register

```http
  POST /api/v1/auth/register
```

| Parameter |   Type   |        Description         |
|:---------:|:--------:|:--------------------------:|
| `Authorization` | `string` | **Required**. Your token |

Takes email, password and returns a json with a new token.


## Tech Stack

**Server:** Java(17), SpringBoot(3.2.2)


## Documentation

[Hello Spring Security](https://docs.spring.io/spring-security/reference/servlet/getting-started.html)

## Docker

Remember that the container required a db container, You can pass container_db in Dockerfile as ENV or ARG, read application-dev.yml for understand it.

About Dockerfile with gradle:
[gradle-and-docker-how-to-run-a-gradle-build-within-docker-container](https://stackoverflow.com/a/74951353/19403177)
```
- docker build -t 'imageName' .
- docker run --network 'network_name_new' --name app -d --name 'container_name' 'yourImage'
```
