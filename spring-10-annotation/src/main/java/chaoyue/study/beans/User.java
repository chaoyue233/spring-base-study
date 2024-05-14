package chaoyue.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class User {
    private Pet pet;
    private Phone phone;
    // @Autowired可以直接打在字段上，使用反射进行注入
    @Autowired
    private Weapon weapon;

    // 集合类型也可以注入，会找到到容器中所有匹配的类型
    @Autowired
    private List<Pet> petList;
    @Autowired
    private Map<String, Pet> petMap; // map类型会使用beanName作为key

    /**
     * 如果@Autowired注解打在Controller上，作用就是给Spring指明构造注入所需要使用的构造器
     * 从Spring4开始，如果一个Bean只有一个有参构造器，就不需要再加@Autowired注解指定
     * Spring会自动调用这个有参构造器完成注入
     */
    @Autowired
    public User(Phone phone) {
        this.phone = phone;
    }

    /**
     * 如果@Autowired注解打在set方法上，会调用Set方法进行注入
     */
    @Qualifier("cat")
    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "pet=" + pet +
                ", phone=" + phone +
                ", weapon=" + weapon +
                ", petList=" + petList +
                ", petMap=" + petMap +
                '}';
    }
}
