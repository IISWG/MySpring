package test;

import cn.muxin.springframework.beans.BeansException;
import cn.muxin.springframework.beans.factory.config.BeanPostProcessor;
import cn.muxin.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import test.bean.IUserService;
import java.util.ArrayList;
import java.util.List;


public class ApiTest {

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}
