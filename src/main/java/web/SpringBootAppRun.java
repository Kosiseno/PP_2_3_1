package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("web.repository")
@EntityScan("web.model")
@SpringBootApplication
public class SpringBootAppRun {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppRun.class, args);
    }
}
