package cn.muxin.springframework.beans.factory.support;

import cn.muxin.springframework.beans.BeansException;
import cn.muxin.springframework.beans.factory.config.BeanDefinition;

/**
 * @ClassName : BeanDefinitionRegistry
 * @author : muxin
 * @date : 2022/5/26-15:58
 * @description : bean信息注册类,定义对 BeanDefinition 的各种增删改操作
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 使用Bean名称查询BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
