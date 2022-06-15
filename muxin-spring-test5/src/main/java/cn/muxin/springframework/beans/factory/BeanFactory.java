package cn.muxin.springframework.beans.factory;

import cn.muxin.springframework.beans.BeansException;

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
}
