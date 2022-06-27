package cn.muxin.springframework.beans.factory.support;

import cn.muxin.springframework.beans.BeansException;
import cn.muxin.springframework.core.io.Resource;
import cn.muxin.springframework.core.io.ResourceLoader;

/**
 * Simple interface for bean definition readers.
 */
/**
 * @ClassName : BeanDefinitionReader
 * @author : muxin
 * @date : 2022/6/26-22:12
 * @description : 主要定义资源文件读取并转换为 BeanDefinition 的各个功能
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}
