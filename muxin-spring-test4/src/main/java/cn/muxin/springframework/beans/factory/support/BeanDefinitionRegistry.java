package cn.muxin.springframework.beans.factory.support;

import cn.muxin.springframework.beans.factory.config.BeanDefinition;

/**
 * @ClassName : BeanDefinitionRegistry
 * @author : muxin
 * @date : 2022/5/26-15:58
 * @description : bean信息注册类
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

}
