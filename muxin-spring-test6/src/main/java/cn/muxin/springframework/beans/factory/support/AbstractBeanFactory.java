package cn.muxin.springframework.beans.factory.support;

import cn.muxin.springframework.beans.BeansException;
import cn.muxin.springframework.beans.factory.config.BeanDefinition;
import cn.muxin.springframework.beans.factory.config.BeanPostProcessor;
import cn.muxin.springframework.beans.factory.config.ConfigurableBeanFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : AbstractBeanFactory
 * @author : muxin
 * @date : 2022/5/26-16:02
 * @description : BeanFactory抽象类
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableBeanFactory {
    /** BeanPostProcessors to apply in createBean */
    private final List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();


    @Override
    public <T> T getBean(String name) throws BeansException {
        return (T)doGetBean(name, null);
    }

    @Override
    public <T> T getBean(String name, Object... args) throws BeansException {
        return (T)doGetBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }
//    /**
//     * 实现BeanFactory接口方法,生成核心的抽象的Bean工厂类，继承DefaultSingletonBeanRegistry，
//     * 使其拥有注册单例Bean的能力
//     * @param name
//     * @return
//     * @throws BeansException
//     */
//    @Override
//    public Object getBean(String name) throws BeansException {
//        Object bean = getSingleton(name);
//        if (bean != null) {
//            return bean;
//        }
//
//        BeanDefinition beanDefinition = getBeanDefinition(name);
//        return createBean(name, beanDefinition);
//    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;


    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor){
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    /**
     * Return the list of BeanPostProcessors that will get applied
     * to beans created with this factory.
     */
    public List<BeanPostProcessor> getBeanPostProcessors() {
        return this.beanPostProcessors;
    }
}
