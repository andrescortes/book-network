package com.co.ali.book.db.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "db")
@Getter
@Setter
public class PostgresProperties {
    private String host;
    private int port;
    private String username;
    private String password;
    private String url;
}
