package chaoyue.study.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        // 创建User对象，这个过程可能会很复杂
        System.out.println("使用FactoryBean创建User对象...");
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
