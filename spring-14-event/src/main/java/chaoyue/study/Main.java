package chaoyue.study;

import chaoyue.study.config.MyConfig;
import chaoyue.study.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        SomeService someService = context.getBean(SomeService.class);
        someService.publishEvent();
    }
}
