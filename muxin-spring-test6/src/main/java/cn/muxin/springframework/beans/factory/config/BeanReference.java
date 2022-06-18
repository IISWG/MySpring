package cn.muxin.springframework.beans.factory.config;

/**
 * @ClassName : BeanReference
 * @author : muxin
 * @date : 2022/5/30-14:42
 * @description : Bean的引用
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}