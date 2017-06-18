package com.maxwell.learning.common.exception;

import com.maxwell.learning.common.utils.Result;
import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/************************************************************************************
 * 功能描述：全局异常处理类
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月16日 --  下午7:05 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理Http异常:404
     *
     * @param e
     * @return
     *
     */
    @ExceptionHandler(UnknownResourceException.class)
    @ResponseBody
    JSONObject handle404Exception(Exception e){
        logger.error(e.getMessage(), e);
        return Result.fail(e.getMessage());
    }

    /**
     * 处理所有业务异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    JSONObject handleBusinessException(BusinessException e){
        logger.error(e.getMessage(), e);
        return Result.fail("业务异常：" + e.getMessage());
    }

    /**
     * 处理所有简单参数异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(ValidationException.class)
    @ResponseBody
    JSONObject handleValidateException(ValidationException e){
        logger.error(e.getMessage(), e);
        return Result.fail("参数异常：" + e.getMessage());
    }


    /**
     * 处理所有接口数据验证异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    JSONObject handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        logger.error(e.getMessage(), e);
        return Result.fail("参数异常：" + e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }


    /**
     * 处理所有不可知的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    JSONObject handleException(Exception e){
        String msg = "未知异常，请联系管理员。错误信息：" + e.getMessage();
        if(e instanceof DataAccessException){
            msg = "数据库异常:" + e.getMessage();
        }

        logger.error(e.getMessage(), e);
        return Result.fail(msg);
    }

}
