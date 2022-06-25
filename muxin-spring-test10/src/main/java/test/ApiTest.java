package test;

import cn.muxin.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;
import test.event.CustomEvent;


public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }
}
