package cn.muxin.springframework.beans.factory.config;

import cn.muxin.springframework.beans.PropertyValues;

/**
 * @author : muxin
 * @ClassName : BeanDefinition
 * @date : 2022/5/26-15:45
 * @description : 一个bean对象的定义信息
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public class BeanDefinition {
    /**
     * bean对象的实际类，后面会用于生成bean的实例对象
     */
    private Class beanClass;

    /**
     * bean的属性信息
     */
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    /**
     * 获得类型
     * @return
     */
    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

}
