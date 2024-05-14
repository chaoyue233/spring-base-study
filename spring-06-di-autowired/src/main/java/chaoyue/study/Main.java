package chaoyue.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
        System.out.println(context.getBean("user3"));
        System.out.println(context.getBean("user4"));
    }
}
