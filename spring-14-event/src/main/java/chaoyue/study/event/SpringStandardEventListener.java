package chaoyue.study.event;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Spring本身提供了一些标准事件的发布
 * 如果有需要的话可以自己增加监听器
 * 这边只列举部分，具体可以参考Spring文档
 */
@Component
public class SpringStandardEventListener {

    @EventListener
    public void listener1(ContextRefreshedEvent event) {
        System.out.println(event);
    }

    @EventListener
    public void listener2(ContextStartedEvent event) {
        System.out.println(event);
    }

    @EventListener
    public void listener3(ContextStoppedEvent event) {
        System.out.println(event);
    }

}
