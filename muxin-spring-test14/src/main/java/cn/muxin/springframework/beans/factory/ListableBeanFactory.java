package cn.muxin.springframework.beans.factory;

import cn.muxin.springframework.beans.BeansException;

import java.util.Map;

/**
 * @ClassName : ListableBeanFactory
 * @author : muxin
 * @date : 2022/6/26-21:52
 * @description : 根据各种条件获取 bean 的配置清单
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public interface ListableBeanFactory extends BeanFactory{

    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();

}
