package com.maxwell.learning.common.service;

import com.maxwell.learning.common.dao.Page;
import com.maxwell.learning.common.entity.BaseEntity;

import java.util.List;

/************************************************************************************
 * 文件功能描述：Service接口的基类，但并不是所有service都会继承接口，有些情况并不适合
 * 创建人：岳增存
 * 创建时间： 2017年05月05日 --  18:48 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public interface CrudService<T extends BaseEntity<T>> {

    void add(T entity);

    void update(T entity);

    void delete(Integer id);

    /**
     * 获取单条数据（id是Integer类型的时候调用此方法）
     * @param id 一般是实体主键
     * @return
     */
    T get(Integer id);

    /**
     * 获取分页数据
     *
     * @param page 分页对象，在controller层要设置必要的分页参数，如 pageNumber, pageSize等
     *             ，但无需处理记录总数totalCount属性，分页拦截器会自动追加
     * @param entity 实体，一般会封装一些查询参数
     * @return 分页数据
     */
    Page<T> getPage(Page<T> page, T entity);

    /**
     * 获取全部数据
     * @param entity 实体，一般会封装一些查询参数
     * @return 全部数据
     */
    List<T> getList(T entity);
}
