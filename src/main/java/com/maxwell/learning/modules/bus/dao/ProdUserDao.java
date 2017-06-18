package com.maxwell.learning.modules.bus.dao;

import com.seentao.datacenter.common.dao.CrudDao;
import com.seentao.datacenter.modules.bus.entity.ProdUser;
import org.springframework.stereotype.Repository;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月14日 --  下午4:33 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Repository
public interface ProdUserDao  extends CrudDao<ProdUser> {
    /**
     * 根据某一信息获取用户
     * @param prodUser
     * @return
     */
    ProdUser getByProdUser(ProdUser prodUser);
}
