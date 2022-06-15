package test;

import cn.muxin.springframework.beans.PropertyValue;
import cn.muxin.springframework.beans.PropertyValues;
import cn.muxin.springframework.beans.factory.config.BeanDefinition;
import cn.muxin.springframework.beans.factory.config.BeanReference;
import cn.muxin.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;
import test.bean.UserDao;
import test.bean.UserService;

/**
 * @ClassName : ApiTest
 * @author : muxin
 * @date : 2022/5/30-14:58
 * @description : 测试类
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取bean
        UserService userService = beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
