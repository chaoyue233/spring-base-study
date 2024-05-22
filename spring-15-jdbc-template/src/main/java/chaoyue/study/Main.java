package chaoyue.study;

import chaoyue.study.config.JdbcTemplateConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcTemplateConfig.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        jdbcTemplate.query("select * from chaoyue_user where id = ?", resultSet -> {
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
        }, 1);
    }
}
