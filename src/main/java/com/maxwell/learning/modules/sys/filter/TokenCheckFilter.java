package com.maxwell.learning.modules.sys.filter;

import com.seentao.datacenter.common.utils.Common;
import com.seentao.datacenter.common.utils.HttpUtil;
import com.seentao.datacenter.modules.sys.util.TokenState;
import com.seentao.datacenter.modules.sys.util.TokenUtil;
import net.minidev.json.JSONObject;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/************************************************************************************
 * 文件功能描述：Token过滤器：对所有请求Api进行验证，token合法则放行，否则拦截。
 * 创建人：岳增存
 * 创建时间： 2017年03月15日 --  19:12 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class TokenCheckFilter implements Filter {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    private final static String[] notCheckUrls = {Common.LOGIN_API, Common.REGISTER_API};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("初始化Token过滤器");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //response.setHeader("Access-Control-Allow-Origin", "*");
        if (!isNeedCheck(request)) {
            //登陆接口不校验token，直接放行
            filterChain.doFilter(request, response);
            return;
        }

        //其他API接口一律校验token

        //从请求头中获取token
        String token = request.getHeader("token");
        if(token == null){
            token = request.getParameter("token");
        }
        logger.info("开始校验token:" + token);
        Map<String, Object> resultMap = TokenUtil.validToken(token);
        TokenState state = TokenState.getTokenState((String) resultMap.get("state"));
        switch (state) {
            case VALID:
                //取出payload中数据,放入到request作用域中
                request.setAttribute("data", resultMap.get("data"));
                //放行
                filterChain.doFilter(request, response);
                break;
            case EXPIRED:
            case INVALID:
                logger.info("无效token");
                //token过期或者无效，则输出错误信息返回给ajax
                JSONObject outputMSg = new JSONObject();
                outputMSg.put("status", 0);
                outputMSg.put("msg", "您的token不合法或者过期了，请重新登陆");
                HttpUtil.outputJson(outputMSg.toJSONString(), response);
                break;
        }
    }

    @Override
    public void destroy() {
        logger.info("销毁Token过滤器");
    }

    private boolean isNeedCheck(HttpServletRequest request){

        logger.info("--------当前请求路径是：---------" + request.getRequestURI());
        for (String url: notCheckUrls) {
            if (request.getRequestURI().endsWith(url)){
                return false;
            }
        }


        return true;
    }
}
