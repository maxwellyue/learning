package com.maxwell.learning.common.service;

import com.maxwell.learning.common.dao.CrudDao;
import com.maxwell.learning.common.dao.Page;
import com.maxwell.learning.common.entity.BaseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/************************************************************************************
 * 文件功能描述：Service实现类的基类，包括了基本的增删改，以及查询（单条、分页、全部）
 *              但并不是所有service实现类都会继承接口，有些情况并不适合，只有对应接口
 *              继承了CrudService，实现类才有必要继承该基类
 * 创建人：岳增存
 * 创建时间： 2017年05月05日 --  17:33 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Transactional(readOnly = true)
public abstract class CrudServiceImpl<D extends CrudDao<T>, T extends BaseEntity<T>> implements CrudService<T>{

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected D dao;

    @Transactional(readOnly = false)
    public void add(T entity) {
        dao.add(entity);
    }

    @Transactional(readOnly = false)
    public void update(T entity) {
        dao.update(entity);
    }

    @Transactional(readOnly = false)
    public void delete(Integer id) {
        dao.delete(id);
    }

    public T get(Integer id) {
        return dao.get(id);
    }

    public Page<T> getPage(Page<T> page, T entity) {
        entity.setPage(page);
        page.setResult(dao.getList(entity));
        return page;
    }

    public List<T> getList(T entity) {
        return dao.getList(entity);
    }

}
