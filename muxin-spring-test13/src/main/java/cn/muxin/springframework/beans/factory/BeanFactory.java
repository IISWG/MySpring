package cn.muxin.springframework.beans.factory;

import cn.muxin.springframework.beans.BeansException;

/**
 * @ClassName : BeanFactory
 * @author : muxin
 * @date : 2022/6/26-21:42
 * @description : 定义获取 bean及 bean的各种属性
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public interface BeanFactory {

    <T> T getBean(String name) throws BeansException;

    /**
     * 用于有参构造函数得到对应的Bean
     * @param name
     * @param args
     * @return
     * @throws BeansException
     */
    <T> T getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
