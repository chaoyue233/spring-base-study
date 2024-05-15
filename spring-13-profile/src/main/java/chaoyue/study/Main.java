package chaoyue.study;

import chaoyue.study.beans.User;
import chaoyue.study.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 多环境配置，注意这里要手动设置ActiveProfiles并进行refresh
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(MyConfig.class);
        context.refresh();
        System.out.println(context.getBean(User.class));
    }
}
