/**
 * Copyright (c) 2005-2012 springside.org.cn
 */
package com.maxwell.learning.common.mapper;

import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;

import java.util.Collection;
import java.util.List;

/**
 * javaBean转换工具类
 *
 * 简单封装Dozer, 实现深度转换Bean<->Bean的Mapper.实现:
 * <p>
 * 1. 持有Mapper的单例.
 * 2. 返回值类型转换.
 * 3. 批量转换Collection中的所有对象.
 * 4. 区分创建新的B对象与将对象A值复制到已存在的B对象两种函数.
 * <p>
 * <p>
 *      Dozer是一个Java对象转换工具，可以在JavaBean和JavaBean之间进行递归数据复制，
 *           并且适应不同复杂的类型。Dozer会直接将名称相同的属性进行复制，属性名不同或者有
 *           特殊的要求则可以在xml中进行配置。
 *       简单了解可参考：http://tedhacker.top/2016/08/17/Dozer%E4%BD%BF%E7%94%A8%E7%AE%80%E8%AE%B0/
 * @author calvin
 * @version 2013-01-15
 */
public class BeanMapper {

    /**
     * 持有Dozer单例, 避免重复创建DozerMapper消耗资源.
     */
    private static DozerBeanMapper dozer = new DozerBeanMapper();

    /**
     * 基于Dozer转换对象的类型.
     */
    public static <T> T map(Object source, Class<T> destinationClass) {
        return dozer.map(source, destinationClass);
    }

    /**
     * 基于Dozer转换Collection中对象的类型.
     */
    @SuppressWarnings("rawtypes")
    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        List<T> destinationList = Lists.newArrayList();
        for (Object sourceObject : sourceList) {
            T destinationObject = dozer.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }

    /**
     * 基于Dozer将对象A的值拷贝到对象B中.
     */
    public static void copy(Object source, Object destinationObject) {
        dozer.map(source, destinationObject);
    }
}