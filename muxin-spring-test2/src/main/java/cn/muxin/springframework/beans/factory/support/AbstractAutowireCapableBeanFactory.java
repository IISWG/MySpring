package cn.muxin.springframework.beans.factory.support;

import cn.muxin.springframework.beans.BeansException;
import cn.muxin.springframework.beans.factory.config.BeanDefinition;

/**
 * @ClassName : AbstractAutowireCapableBeanFactory
 * @author : muxin
 * @date : 2022/5/26-16:04
 * @description : 那么在继承抽象类 AbstractBeanFactory 后的
 * AbstractAutowireCapableBeanFactory 就可以实现相应的抽象方法了，
 * 因为 AbstractAutowireCapableBeanFactory 本身也是一个抽象类，
 * 所以它只会实现属于自己的抽象方法，其他抽象方法由继承 AbstractAutowireCapableBeanFactory 的类实现。
 * 这里就体现了类实现过程中的各司其职，你只需要关心属于你的内容，不是你的内容，不要参与。
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            //这里通过bean定义类得到bean实际的类，通过反射无参构造了一个bean的实际对象
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            //这里可能会有无法反射生成对象报错
            throw new BeansException("Instantiation of bean failed", e);
        }
        //实例化好了，需要加入到容器的注册表里
        addSingleton(beanName, bean);
        return bean;
    }

}