package chaoyue.study;

import chaoyue.study.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 使用ID获取bean
        System.out.println(context.getBean("user"));
        // 使用别名获取bean
        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
        System.out.println(context.getBean("user3"));

        // 获取容器中所有User类型的Bean名称
        Map<String, User> beansOfType = context.getBeansOfType(User.class);
        System.out.println(beansOfType);
    }
}
