package cn.muxin.springframework.beans;

/**
 * @ClassName : PropertyValue
 * @author : muxin
 * @date : 2022/5/30-14:43
 * @description : Bean的属性信息
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */

public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}