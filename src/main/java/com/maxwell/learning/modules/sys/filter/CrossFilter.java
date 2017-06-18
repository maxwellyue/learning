package com.maxwell.learning.modules.sys.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/************************************************************************************
 * 文件功能描述：
 * 创建人：岳增存
 * 创建时间： 2017年05月09日 --  22:45 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class CrossFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        //由于加入了token自定义请求头，所有请求都是非简单请求，要针对预检请求处理
        if (request.getMethod().equals("OPTIONS")) {
            response.setHeader("Access-Control-Request-Method", "POST,GET,PUT");
            response.setHeader("Access-Control-Allow-Methods", "POST,GET,PUT");
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Credentials", "true");
            response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, token, X-Prototype-Version");
            return;
        } else {
            chain.doFilter(req, res);
        }

    }

    @Override
    public void destroy() {
    }

}
