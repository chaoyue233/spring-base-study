package chaoyue.study;

import chaoyue.study.beans.User;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * EL表达式简单使用
 * EL表达式如果在配置中使用，需要用#{el}的形式
 * 可以在xml中使用，也可以在注解中使用（特别是@Value注解）
 */
public class Main {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        // 解析表达式
        Expression expression = parser.parseExpression("'hello el'");
        System.out.println(expression.getValue());

        // 拼接字符串
        expression = parser.parseExpression("'hello el'.concat('!')");
        System.out.println(expression.getValue());

        // 获取属性
        expression = parser.parseExpression("'hello el'.bytes.length");
        System.out.println(expression.getValue());

        // 创建对象
        expression = parser.parseExpression("new chaoyue.study.beans.User('chaoyue')");
        User user = expression.getValue(User.class);
        System.out.println(user);

        // 获取对象的属性
        expression = parser.parseExpression("name");
        String name = (String) expression.getValue(user);
        System.out.println(name);

        // 生成随机数 T表示调用的是静态方法，用来和动态方法做区分
        expression = parser.parseExpression("T(java.lang.Math).random() * 100.0");
        System.out.println(expression.getValue());
    }
}
