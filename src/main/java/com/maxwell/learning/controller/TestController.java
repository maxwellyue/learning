package com.maxwell.learning.controller;

import com.maxwell.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/************************************************************************************
 * 文件功能描述：
 * 创建人：岳增存
 * 创建时间： 2017年03月07日 --  18:51 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    //返回json
    @RequestMapping(value = "/getUserJson")
    @ResponseBody
    public Object getUserJson(Integer id){
        return userService.getUser(id);
    }


    //返回页面
    @RequestMapping(value = "/getUserHtml")
    public String getUserHtml(Model model, Integer id){
        model.addAttribute("user", userService.getUser(id).toString());
        return "index";
    }

}
