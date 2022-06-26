package cn.muxin.springframework.beans;

/**
 * @ClassName : BeansException
 * @author : muxin
 * @date : 2022/5/26-15:15
 * @description : 定义Bean异常
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
