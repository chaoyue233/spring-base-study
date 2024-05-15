package chaoyue.study.service;

import chaoyue.study.event.MyEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class SomeService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher eventPublisher;

    public void publishEvent() {
        MyEvent myEvent = new MyEvent(this);
        System.out.println("事件发布");
        eventPublisher.publishEvent(myEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
