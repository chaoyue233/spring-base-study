package chaoyue.study.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 回调方式整体分为三组，执行先后顺序如下
 * 1. JDK 注解模式 需要开启注解支持
 * 2. 接口模式
 * 3. beanDefinition 方法指定模式
 */
public class User implements InitializingBean, DisposableBean {
    /**
     * InitializingBean 接口
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        // 在属性注入完成后回调该方法
        System.out.println("user afterPropertiesSet()...");
    }
    /**
     * DisposableBean 接口
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("user destroy()...");
    }

    /**
     * 需要在bean中手动指定调用方法
     */
    public void beanInit(){
        System.out.println("user beanInit()...");
    }
    public void beanDestroy(){
        System.out.println("user beanDestroy()...");
    }

    /**
     * 使用jdk原生注解进行标识
     */
    @PostConstruct
    public void annotationInit(){
        System.out.println("user annotationInit()...");
    }
    @PreDestroy
    public void annotationDestroy(){
        System.out.println("user annotationDestroy()...");
    }
}
