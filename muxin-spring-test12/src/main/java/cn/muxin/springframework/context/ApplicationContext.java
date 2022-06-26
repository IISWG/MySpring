package cn.muxin.springframework.context;

import cn.muxin.springframework.beans.factory.HierarchicalBeanFactory;
import cn.muxin.springframework.beans.factory.ListableBeanFactory;
import cn.muxin.springframework.core.io.ResourceLoader;

/**
 * Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 *
 * 应用上下文
 *
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}