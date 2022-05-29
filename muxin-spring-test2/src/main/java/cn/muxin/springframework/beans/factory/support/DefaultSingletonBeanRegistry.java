package cn.muxin.springframework.beans.factory.support;

import cn.muxin.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : DefaultSingletonBeanRegistry
 * @author : muxin
 * @date : 2022/5/26-15:56
 * @description : 实现单例表接口，完成默认方式的单例表注册
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    /**
     * 用于存储实例化好的单例bean对象 。
     */
    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}