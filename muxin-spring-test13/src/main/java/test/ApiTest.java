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
    /**
     * @methodName: test_scan
     * @author : muxin
     * @date : 2022/6/27-15:44
     * @description : 包扫描功能测试
     * @Todo :
     * @params :
         void
     * @return : void
     * @throws:
     */
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

    @Test
    /**
     * @methodName: test_property
     * @author : muxin
     * @date : 2022/6/27-15:45
     * @description : 占位符功能测试
     * @Todo :
     * @params : 
         void
     * @return : void
     * @throws: 
     */
    public void test_property() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-property.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService);
    }

    @Test
    public void test_beanPost(){

        BeanPostProcessor beanPostProcessor = new BeanPostProcessor() {
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
                return null;
            }

            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                return null;
            }
        };

        List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();
        beanPostProcessors.add(beanPostProcessor);
        beanPostProcessors.add(beanPostProcessor);
        beanPostProcessors.remove(beanPostProcessor);

        System.out.println(beanPostProcessors.size());
    }

}
