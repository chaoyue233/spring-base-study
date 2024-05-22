package chaoyue.study.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 使用编程的方式来监听事件
 */
@Component
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("收到事件（编程方式）" + event);
    }
}
