package chaoyue.study;

import chaoyue.study.beans.User;
import chaoyue.study.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(context.getBean(User.class));
    }
}
