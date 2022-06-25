package cn.muxin.springframework.beans.factory.config;

/**
 * @ClassName : SingletonBeanRegistry
 * @author : muxin
 * @date : 2022/5/26-15:49
 * @description : 单例bean注册表
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
