package chaoyue.study.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 使用注解的方式处理事件监听
 */
@Component
public class MyListenerAnnotation {

    @EventListener
    public void receiveMyEvent(MyEvent event) {
        System.out.println("收到事件（注解方式）" + event);
    }
}
