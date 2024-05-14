package chaoyue.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 多次获取singleton的bean 返回同一个对象
        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user1"));

        // 多次获取prototype的bean 返回不同的对象
        System.out.println(context.getBean("user2"));
        System.out.println(context.getBean("user2"));
    }
}
