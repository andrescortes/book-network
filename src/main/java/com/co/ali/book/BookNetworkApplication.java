package com.co.ali.book;

import com.co.ali.book.role.Role;
import com.co.ali.book.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class BookNetworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookNetworkApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(RoleRepository repository) {
        return args -> {
            if (repository.findByName("USER").isEmpty()) {
                repository.save(
                        Role.builder()
                                .name("USER")
                                .build()
                );
            }
        };
    }

}
