package chaoyue.study;

import chaoyue.study.aware.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        SomeService bean = context.getBean(SomeService.class);
        System.out.println(bean.getName());
        System.out.println(bean.getApplicationContext());
        System.out.println(context);
    }
}
