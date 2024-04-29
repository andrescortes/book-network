package com.co.ali.book.db.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class ConfigDatabase {

    private static Properties propertiesSql() {
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto", "update");
        jpaProperties.put("hibernate.show_sql", "true");
        jpaProperties.put("hibernate.format_sql", "true");
//        jpaProperties.put("hibernate.use_sql_comments", "true");
//        jpaProperties.put("hibernate.jdbc.batch_size", "50");
//        jpaProperties.put("hibernate.jdbc.batch_parameter_size", "50");
//        jpaProperties.put("hibernate.jdbc.batch_parameter_length", "50");
//        jpaProperties.put("hibernate.order_inserts", "true");
//        jpaProperties.put("hibernate.order_updates", "true");
        return jpaProperties;
    }

    @Bean
    DataSource dataSource(PostgresProperties properties) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(properties.getUrl());
        config.setUsername(properties.getUsername());
        config.setPassword(properties.getPassword());
        config.setDriverClassName("org.postgresql.Driver");
        return new HikariDataSource(config);
    }

    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource);
        bean.setPackagesToScan("com.co.ali.book");
        bean.setPersistenceUnitName("BookPersistenceUnit");

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        bean.setJpaVendorAdapter(vendorAdapter);
        Properties jpaProperties = propertiesSql();
        bean.setJpaProperties(jpaProperties);
        return bean;
    }
}
