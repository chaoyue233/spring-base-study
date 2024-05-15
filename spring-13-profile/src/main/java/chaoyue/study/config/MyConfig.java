package chaoyue.study.config;

import chaoyue.study.beans.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * 注解@Profile本质上也是@Conditional注解
 */
@PropertySource("classpath:/my.properties")
@Configuration
public class MyConfig {

    @Value("${chaoyue.name}")
    private String name;

    @Bean
    @Profile("dev")
    public User devUser() {
        System.out.println(name);
        return new User("devUser");
    }

    @Bean
    @Profile("prod")
    public User prodUser() {
        System.out.println(name);
        return new User("prodUser");
    }
}
