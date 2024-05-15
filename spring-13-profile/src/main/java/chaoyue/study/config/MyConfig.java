package chaoyue.study.config;

import chaoyue.study.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyConfig {

    @Bean
    @Profile("dev")
    public User devUser() {
        return new User("devUser");
    }

    @Bean
    @Profile("prod")
    public User prodUser() {
        return new User("prodUser");
    }
}
