package chaoyue.study.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
        System.out.println("自定义事件创建");
    }
}
