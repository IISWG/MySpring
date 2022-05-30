package cn.muxin.springframework.beans.factory.support;

import cn.muxin.springframework.beans.BeansException;
import cn.muxin.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

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
    //这里默认使用的是cglib方式实例化，我们可以通过设置来改变实例化的策略
    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
//        Object bean;
//        try {
//            //这里通过bean定义类得到bean实际的类，通过反射无参构造了一个bean的实际对象
//            bean = beanDefinition.getBeanClass().newInstance();
//        } catch (InstantiationException | IllegalAccessException e) {
//            //这里可能会有无法反射生成对象报错
//            throw new BeansException("Instantiation of bean failed", e);
//        }
//        //实例化好了，需要加入到容器的注册表里
//        addSingleton(beanName, bean);
//        return bean;

        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition, beanName, args);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            //这里只是简单的判断了参数的个数是否匹配，源码里面还进行参数类型比对
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}