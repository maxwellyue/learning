package com.maxwell.learning.common.exception;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月16日 --  下午7:16 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class BusinessException extends RuntimeException {
    public BusinessException(){
        super();
    }

    public BusinessException(String message){
        super(message);
    }
}
