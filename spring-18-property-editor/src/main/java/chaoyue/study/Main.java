package chaoyue.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * PropertyEditor 可以帮助我们实现对象和字符串之间的转化
 * Spring提供了很多PropertyEditor的实现类，一般来说一种类型就对应一个实现类
 * 对于我们自定义的类型，可以自己实现PropertyEditor接口来实现转化
 * 因为Spring一开始的配置都是通过xml来完成的，xml中配置的全部都是字符串
 * 一般和前面的BeanWrapper配合使用，将字符串转为对象之后，在通过BeanWrapper进行赋值
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(context.getBean("user"));
    }
}
