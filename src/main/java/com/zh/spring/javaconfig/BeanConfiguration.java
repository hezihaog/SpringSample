package com.zh.spring.javaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration注解，表示这个类为配置类，Spring需要扫描该类中的bean
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public Singer daolang() {
        Singer singer = new Singer();
        singer.setName("刀郎");
        return singer;
    }

    @Bean
    public Dancer liujia() {
        Dancer dancer = new Dancer();
        dancer.setName("刘迦");
        return dancer;
    }

    /**
     * 因为我们的Stage模型，并没有加@Component注解，并没有id，所以只能按照类型来查找
     * autowire = Autowire.BY_TYPE，表示里面的成员，按成员类型，在容器中查询，装配该Bean
     * autowire = Autowire.BY_NAME，表示里面的成员，按成员的变量名，在容器中查询，装配该Bean
     */
    @Bean(autowire = Autowire.BY_TYPE)
    public Stage stage() {
        return new Stage();
    }
}