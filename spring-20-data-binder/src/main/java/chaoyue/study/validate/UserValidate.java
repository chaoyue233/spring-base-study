package chaoyue.study.validate;

import chaoyue.study.beans.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * 自定义的校验规则
 */
public class UserValidate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class == clazz;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        // 如果name属性的长度小于3 则认为参数异常
        if (user.getName().length() < 3) {
            errors.rejectValue("name", "500", "name length must over 3");
        }
    }
}
