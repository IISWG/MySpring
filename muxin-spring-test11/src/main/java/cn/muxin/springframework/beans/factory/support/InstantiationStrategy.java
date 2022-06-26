package cn.muxin.springframework.beans.factory.support;

import cn.muxin.springframework.beans.BeansException;
import cn.muxin.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @ClassName : InstantiationStrategy
 * @author : muxin
 * @date : 2022/5/29-17:12
 * @description : Bean的实例化策略
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
