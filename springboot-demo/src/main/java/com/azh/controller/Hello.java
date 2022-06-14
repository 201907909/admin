package com.azh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈同学
 */
@RestController
/**
 * 在控制器中提供一个 “/hello” 接口，此时需要配置包扫描
 * 才能将 hello 注册到 Spring MVC 容器中，
 * 以需要在 FirstSpringBootPrjApplication
 * 上添加一个注解 @ComponentScan 进行包扫描。
 * 也可以直接使用组合注解 @Spring BootApplication
 * 来代替 @EnableAutoConfiguration 和 @ComponentScan。
 *
 * 作者：YuJian
 * 链接：https://juejin.cn/post/7043347803568865310
 * 来源：稀土掘金
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Hello {
    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot";
    }
}
