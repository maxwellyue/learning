package com.maxwell.learning.common.utils;

import net.minidev.json.JSONObject;

/************************************************************************************
 * 文件功能描述：返回的数据的封装
 * 创建人：岳增存
 * 创建时间： 2017年03月15日 --  18:50 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Result extends JSONObject{
    /**
     * 返回成功信息
     *
     * @param data
     * @return
     */
    public static JSONObject success(String msg, Object data) {

        JSONObject resultMap = new JSONObject();

        resultMap.put("status", "1");
        resultMap.put("msg", msg);
        if (data != null) {
            resultMap.put("data", data);
        }else {
            resultMap.put("data", null);
        }

        return resultMap;
    }

    /**
     * 返回成功信息
     * @return
     */
    public static JSONObject success(String msg) {
        JSONObject resultMap = new JSONObject();
        resultMap.put("status", "1");
        resultMap.put("msg", msg);
        return resultMap;
    }


    /**
     * 返回失败信息
     * @return
     */
    public static JSONObject fail(String msg) {
        JSONObject resultMap = new JSONObject();
        resultMap.put("status", "0");
        resultMap.put("msg", msg);
        return resultMap;
    }
    /**
     * 返回失败信息
     * @return
     */
    public static JSONObject fail(String msg, Object data) {
        JSONObject resultMap = new JSONObject();
        resultMap.put("status", "0");
        resultMap.put("msg", msg);
        if (data != null) {
            resultMap.put("data", data);
        }
        return resultMap;
    }

}
