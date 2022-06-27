package cn.muxin.springframework.core.io;

/**
 * @ClassName : ResourceLoader
 * @author : muxin
 * @date : 2022/6/26-22:11
 * @description : 定义资源加载器，主要应用于根据给定的资源文件地址返回对应的Resource
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
