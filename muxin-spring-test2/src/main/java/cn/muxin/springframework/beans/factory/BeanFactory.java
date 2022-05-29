package cn.muxin.springframework.beans.factory;

import cn.muxin.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
