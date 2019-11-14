package com.mengxuegu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication  标识引导类，包含以下3个重要注解
 * @SpringBootConfiguration
 *      @Configuration 它属于Spring中的一个注解，定义配置类，等价于配置文件
 *      @Component 添加到spring容器中，表示是一个组件
 * @EnableAutoConfiguration
 *      @AutoConfigurationPackage 将引导类所在包及其子包下面所有的组件添加到spring容器中去
 *      @Import({AutoConfigurationImportSelector.class})
 *          1、将所有组件以全类名的方式返回，并且添加到spring容器中
 *          2、会给spring容器导入非常多的自动配置类（******AutoConfiguration）就是导入并配置好很多当前需要的配置，省去我们手动编写配置然后注入到组件中
 *
 * @ComponentScan 被该注解标识的类，会被spring容器进行管理
 *
 */

@SpringBootApplication //标识引导类
public class HelloMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloMainApplication.class,args);
    }
}
