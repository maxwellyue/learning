package com.maxwell.learning.common.exception;

/************************************************************************************
 * 功能描述：参数校验异常（手动校验，主动抛出该异常）
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月17日 --  上午11:12 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class ValidationException extends RuntimeException {

    public ValidationException(){super();}
    public ValidationException(String msg){
        super(msg);
    }
}
