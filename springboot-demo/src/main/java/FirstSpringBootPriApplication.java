import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @EnableAutoConfiguration 注解表示开启自动化配置。由于项目中添加了 spring-boot-starter-web 依赖，
 * 因此在开启了自动化配置之后，会自动进行 Spring 和 Spring MVC 的配置
 */
@ComponentScan(basePackages ="com.azh.*" )
@EnableAutoConfiguration
public class FirstSpringBootPriApplication {
    public static void main(String[] args) {
        /**
         * 在 Java 项目的 main 方法中，通过 SpringApplication 中的 run 方法启动项目。
         * 第一个参数传入 App.class，告诉 Spring 哪个是主要组件。
         * 第二个参数是运行时输入的其他参数。
         */
        SpringApplication.run(FirstSpringBootPriApplication.class,args);
    }
}
