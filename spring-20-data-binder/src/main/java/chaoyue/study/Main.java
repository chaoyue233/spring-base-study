package chaoyue.study;

import chaoyue.study.beans.User;
import chaoyue.study.validate.UserValidate;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * 从Spring3开始，可以使用Validator + DataBinder进行数据校验
 * 后面SpringMVC中的@Validated校验本质上就是对这种方式的封装
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("a");
        // 绑定的是数据和校验规则
        DataBinder dataBinder = new DataBinder(user);
        dataBinder.addValidators(new UserValidate());
        // 验证规则
        dataBinder.validate();
        // 获取验证结果
        BindingResult bindingResult = dataBinder.getBindingResult();
        bindingResult.getAllErrors().forEach(System.out::println);
    }
}
