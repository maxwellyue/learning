package com.maxwell.learning.common.dao;

import java.util.List;

/************************************************************************************
 * 文件功能描述：
 * 创建人：岳增存
 * 创建时间： 2017年05月05日 --  16:58 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public interface CrudDao<T> {

    /**
     * 插入数据
     * @param entity
     * @return
     */
    public int add(T entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    public int update(T entity);

    /**
     * 删除数据
     * @param id
     * @see public int delete(T entity)
     * @return
     */
    public int delete(Integer id);


    /**
     * 获取单条数据
     * @param id
     * @return
     */
    public T get(Integer id);


    /**
     * 查询数据列表：如果需要分页，必须设置分页对象：entity.setPage(new Page<T>())，不设置分页对象则不分页
     * 在Mapper映射文件中，无需处理分页，即不必写limit ..., ...类似的语句
     * @param entity
     * @return
     */
    public List<T> getList(T entity);




}
