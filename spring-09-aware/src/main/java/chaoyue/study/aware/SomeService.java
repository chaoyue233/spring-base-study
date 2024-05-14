package chaoyue.study.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SomeService implements BeanNameAware, ApplicationContextAware {
    private String name;
    private ApplicationContext applicationContext;

    public String getName() {
        return name;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
