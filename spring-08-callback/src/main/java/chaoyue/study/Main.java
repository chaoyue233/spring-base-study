package chaoyue.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        // 只有手动调用close方法才会触发destroy回掉
        context.close();
    }
}
