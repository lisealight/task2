package ru.tinkoff.edu.java.scrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.tinkoff.edu.java.scrapper.configuration.ApplicationConfig;

@SpringBootConfiguration
@EnableConfigurationProperties(ApplicationConfig.class)
public class ScrapperApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(ScrapperApplication.class, args);
        ApplicationConfig config = ctx.getBean(ApplicationConfig.class);
        System.out.println(config);
    }
}
