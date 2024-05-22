package chaoyue.study;

import chaoyue.study.beans.Cat;
import chaoyue.study.beans.User;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * BeanWrapper是Spring的反射工具类
 * 提供了设置/获取属性值、获取属性描述符、确定是否可读写等方法封装
 * 底层本质上也是调用的反射
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        // 将实例进行包装 并设置属性值
        BeanWrapper beanWrapper = new BeanWrapperImpl(user);
        beanWrapper.setPropertyValue("name", "chaoyue");
        beanWrapper.setPropertyValue("cat", new Cat());
        // 级联属性赋值
        beanWrapper.setPropertyValue("cat.name","pudding");

        // 获取被包装的原始对象
        System.out.println(beanWrapper.getWrappedInstance());
    }
}
