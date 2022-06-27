package cn.muxin.springframework.beans.factory;

/**
 * Sub-interface implemented by bean factories that can be part
 * of a hierarchy.
 * 继承 BeanFactory ，也就是在 BeanFactory 定义的功能的基础
 * 上增加了对 parentFactory 支持
 */
public interface HierarchicalBeanFactory extends BeanFactory {
}
