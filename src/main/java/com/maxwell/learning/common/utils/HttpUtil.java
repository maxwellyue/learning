package com.maxwell.learning.common.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/************************************************************************************
 * 文件功能描述：
 * 创建人：岳增存
 * 创建时间： 2017年04月09日 --  16:37 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class HttpUtil {

    /**
     * 输出json格式的字符串
     * @param jsonStr
     * @param response
     * @throws IOException
     */
    public static void outputJson(String jsonStr, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8;");
        PrintWriter out = response.getWriter();
        out.write(jsonStr);
        out.flush();
        out.close();
    }
}
