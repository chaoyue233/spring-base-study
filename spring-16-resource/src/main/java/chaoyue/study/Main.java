package chaoyue.study;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Resource是Spring对资源对统一封装
 * ApplicationContext继承了ResourceLoader接口
 * 不同的ApplicationContext实现类对应的ResourceLoader实现类也不一样
 * 容器启动的时候就是使用的各自对应的ResourceLoader来进行资源加载的
 * Resource也可以使用不同的前缀做区分，比如classpath: file: 等等，分别对应不同的ResourceLoader
 * ApplicationContext启动的时候会根据前缀替换掉里面的ResourceLoader实现
 * 路径支持ant模式的通配符 ?-单字符 *-任意字符 **-任意目录
 * classpath*表示从依赖的jar文件的类路径中也进行扫描和加载
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // 从类路径中获取资源
        Resource resource = new ClassPathResource("hello.txt");
        System.out.println(resource.contentLength());
        // 从文件系统中获取资源
        resource = new FileSystemResource("/Users/chaoyue/Downloads/hello.txt");
        System.out.println(resource.contentLength());
    }
}
