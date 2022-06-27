package cn.muxin.springframework.util;

/**
 * Simple strategy interface for resolving a String value.
 * Used by {@link cn.muxin.springframework.beans.factory.config.ConfigurableBeanFactory}.
 * <p>
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);

}