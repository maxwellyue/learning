package com.maxwell.learning.common.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月16日 --  下午8:54 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Controller
public class DefaultController {
    @RequestMapping("/**")
    public void unmappedRequest(HttpServletRequest request) {
        String uri = request.getRequestURI();
        throw new UnknownResourceException("你确定接口地址写对了？我还没写这个接口呢：" + uri);
    }
}
