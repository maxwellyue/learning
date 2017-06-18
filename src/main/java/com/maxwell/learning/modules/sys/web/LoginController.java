package com.maxwell.learning.modules.sys.web;

import com.seentao.datacenter.common.utils.Result;
import com.seentao.datacenter.common.web.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/************************************************************************************
 * 文件功能描述：
 * 创建人：岳增存
 * 创建时间： 2017年03月15日 --  17:15 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/

@RestController
@RequestMapping("/api/")
public class LoginController extends BaseController {

    @RequestMapping(value = "login")
    public Object login(){

        File file;
        return Result.success("成功了11111");
    }

    /*@Autowired
    private UserService userService;





    *//**
     * 用户登录接口
     *
     * @param login 登录信息的实体类
     * @return 返回json
     *//*
    @RequestMapping(value = "login")
    @ResponseBody
    public Object login(@RequestBody Login login) {
        JSONObject resultJSON = new JSONObject();
        //验证用户名和密码
        if (login != null && userService.loginValidate(login)) {
            User user = userService.getUserByLoginAccount(login.getLoginAccount());

            //用户名密码校验成功后，生成token并返回客户端
            Map<String, Object> payload = new HashMap<String, Object>();
            Date date = new Date();

            //生成token,将用户信息保存到token
            payload.put("loginAccount", login.getLoginAccount());//用户登录名
            payload.put("userId", user.getId());
            payload.put("iat", date.getTime());//生成时间
            payload.put("ext", date.getTime() + 1000 * 60 * 60 * 24 * 2);//过期时间2天
            String token = TokenUtil.createToken(payload);

            resultJSON.put("status", 1);
            resultJSON.put("msg", "登陆成功");
            resultJSON.put("token", token);

            //处理shiro的信息
           *//* Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken shiroToken = new UsernamePasswordToken(user.getLoginAccount(), user.getPassword());
            subject.login(shiroToken);*//*
        } else {
            resultJSON.put("status", 0);
            resultJSON.put("msg", "用户名或密码不对");
        }
        return resultJSON;
    }

    *//**
     * 退出登录
     * @return
     *//*
    public Object logout(HttpServletRequest request){
        //TokenUtil.

        return null;
    }*/

}
