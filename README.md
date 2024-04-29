
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

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Authorization` | `string` | **Required**. Your token |

Takes email, password and returns a json with a new token.


## Tech Stack

**Server:** Java(17), SpringBoot(3.2.2)


## Documentation

[Hello Spring Security](https://docs.spring.io/spring-security/reference/servlet/getting-started.html)

