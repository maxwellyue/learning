package com.maxwell.learning.modules.sys.web;

import com.seentao.datacenter.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/************************************************************************************
 * 文件功能描述：
 * 创建人：岳增存
 * 创建时间： 2017年03月16日 --  14:40 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Controller
@RequestMapping("/api/sys/user/")
public class UserController extends BaseController {

    /*@Autowired
    private UserService userService;

    *//**
     * 新增
     *
     * @param
     * @return
     *//*
    @RequestMapping("add")
    @ResponseBody
    public Object add(@RequestBody User user) {
        try {
            return ResultUtil.success("添加用户成功", userService.addUser(user));
        } catch (Exception e) {
            logger.error("添加用户失败", e);
            return ResultUtil.fail("添加用户失败");
        }
    }


    *//**
     * 更新
     *
     * @param
     * @return
     *//*
    @RequestMapping("update")
    @ResponseBody
    public Object update(@RequestBody User user) {
        try {
            return ResultUtil.success("更新用户成功", userService.updateUser(user));
        } catch (Exception e) {
            logger.error("更新用户失败", e);
            return ResultUtil.fail("更新用户失败");
        }
    }


    *//**
     * 删除
     *
     * @param
     * @return
     *//*
    @RequestMapping("delete/{userId}")
    @ResponseBody
    public Object update(@PathVariable("userId") Integer userId) {
        try {
            return ResultUtil.success("删除用户成功", userService.deleteUser(userId));
        } catch (Exception e) {
            logger.error("删除用户失败", e);
            return ResultUtil.fail("删除用户失败");
        }
    }


    *//**
     * 获取当前登录用户信息
     *
     * @param request
     * @return
     *//*
    @RequestMapping("get")
    @ResponseBody
    public Object get(HttpServletRequest request) {
        User user = userService.getUserByLoginAccount(TokenUtil.getUserLoginAccount(request));
        user.setPassword("");
        return ResultUtil.success("成功", user);
    }

    *//**
     * 获取所有用户
     *
     * @param
     * @return
     *//*
    @RequestMapping("list")
    @ResponseBody
    public Object list(@RequestBody User user) {
        try {
            return ResultUtil.success("获取用户成功", userService.getUserList(user));
        } catch (Exception e) {
            logger.error("获取用户失败", e);
            return ResultUtil.fail("获取用户失败");
        }

    }*/

}
