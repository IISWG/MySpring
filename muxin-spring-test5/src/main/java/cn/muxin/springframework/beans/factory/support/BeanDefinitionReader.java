package cn.muxin.springframework.beans.factory.support;

import cn.muxin.springframework.beans.BeansException;
import cn.muxin.springframework.core.io.Resource;
import cn.muxin.springframework.core.io.ResourceLoader;

/**
 * Simple interface for bean definition readers.
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
