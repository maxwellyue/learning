package com.maxwell.learning.common.utils;

/************************************************************************************
 * 文件功能描述：
 * 创建人：岳增存
 * 创建时间： 2017年04月12日 --  15:24 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class StringUtil extends org.apache.commons.lang3.StringUtils {

    /**
     * 将字符串根据分隔符分割为数组形式
     * @param str 字符串
     * @param separator 分隔符
     * @return 字符串数组  字符串为空则返回长度为0的数组
     */
    public static String[] toArray(String str, String separator){
        String[] result = new String[]{};
        if(!isBlank(str)){
            result = str.split(separator);
        }
        return result;
    }






}
