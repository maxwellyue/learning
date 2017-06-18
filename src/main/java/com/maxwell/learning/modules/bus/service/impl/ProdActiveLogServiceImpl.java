package com.maxwell.learning.modules.bus.service.impl;

import com.seentao.datacenter.common.service.CrudServiceImpl;
import com.seentao.datacenter.modules.bus.dao.ProdActiveLogDao;
import com.seentao.datacenter.modules.bus.entity.ProdActiveLog;
import com.seentao.datacenter.modules.bus.service.ProdActiveLogService;
import org.springframework.stereotype.Service;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月16日 --  上午11:12 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Service
public class ProdActiveLogServiceImpl extends CrudServiceImpl<ProdActiveLogDao, ProdActiveLog> implements ProdActiveLogService {
}
