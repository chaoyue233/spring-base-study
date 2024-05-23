package chaoyue.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Converter Spring3之后提供的功能，即类型与类型之间的转化能力（相比前面的PropertyEditor只能实现字符串和类型之间的转化）
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(context.getBean("user"));
    }
}
