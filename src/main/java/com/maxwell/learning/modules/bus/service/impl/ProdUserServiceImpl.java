package com.maxwell.learning.modules.bus.service.impl;

import com.seentao.datacenter.common.mapper.BeanMapper;
import com.seentao.datacenter.common.service.CrudServiceImpl;
import com.seentao.datacenter.common.utils.IdGen;
import com.seentao.datacenter.common.utils.StringUtil;
import com.seentao.datacenter.modules.bus.dao.ProdProductUserDao;
import com.seentao.datacenter.modules.bus.dao.ProdUserDao;
import com.seentao.datacenter.modules.bus.entity.ProdProductUser;
import com.seentao.datacenter.modules.bus.entity.ProdUser;
import com.seentao.datacenter.modules.bus.service.ProdUserService;
import com.seentao.datacenter.modules.bus.vo.ProdUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年06月14日 --  下午5:07 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Service
public class ProdUserServiceImpl extends CrudServiceImpl<ProdUserDao, ProdUser> implements ProdUserService {

    @Autowired
    private ProdUserDao prodUserDao;
    @Autowired
    private ProdProductUserDao prodProductUserDao;

    @Transactional
    @Override
    public boolean addProdUserRelation(ProdUserVo prodUserVo) {
        String existedUserId = getExistedUserId(prodUserVo);
        //用户在系统中不存在
        if (StringUtil.isBlank(existedUserId)) {
            ProdUser user = new ProdUser();
            BeanMapper.copy(prodUserVo, user);
            user.setId(IdGen.uuid());
            prodUserDao.add(user);
            existedUserId = user.getId();
        }

        ProdProductUser productUser = new ProdProductUser();
        BeanMapper.copy(prodUserVo, productUser);
        productUser.setUserId(existedUserId);
        productUser.setIsSynchronized(false);

        return prodProductUserDao.add(productUser)>0;
    }

    @Override
    public boolean addBatchProdUserRelation(ProdUserVo prodUserVo) {
        return false;
    }

    /**
     * 判断用户是否已经存在
     * 两种方式：身份证号相同，则认为是同一用户；
     * 所属客户相同，并且手机或邮箱至少有一项相同，则认为是同一用户；
     *
     * @param prodUserVo
     * @return
     */
    private String getExistedUserId(ProdUserVo prodUserVo) {
        //身份证号相同
        if (!StringUtil.isBlank(prodUserVo.getIdentityCardNo())) {
            ProdUser user = new ProdUser();
            user.setIdentityCardNo(prodUserVo.getIdentityCardNo());
            ProdUser user1 = prodUserDao.getByProdUser(user);
            if (user1 != null) {
                return user1.getId();
            }
        }

        //所属客户相同，并且邮箱相同；
        if (true) {
            ProdUser user = new ProdUser();
            user.setCustomerId(prodUserVo.getCustomerId());
            user.setEmail(prodUserVo.getEmail());
            ProdUser user1 = prodUserDao.getByProdUser(user);
            if (user1 != null) {
                return user1.getId();
            }
        }

        //所属客户相同，并且手机号相同；
        if (true) {
            ProdUser user = new ProdUser();
            user.setCustomerId(prodUserVo.getCustomerId());
            user.setMobilePhone(prodUserVo.getMobilePhone());
            ProdUser user1 = prodUserDao.getByProdUser(user);
            if (user1 != null) {
                return user1.getId();
            }
        }

        return null;
    }
}

