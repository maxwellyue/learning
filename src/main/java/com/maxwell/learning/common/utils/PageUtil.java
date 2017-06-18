package com.maxwell.learning.common.utils;

import com.maxwell.learning.common.dao.Page;
import com.maxwell.learning.common.entity.BaseEntity;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 分页工具
 *
 * @author henryyan
 */
public class PageUtil {

    public static int PAGE_SIZE = 30;

    public static int[] init(Page<?> page, HttpServletRequest request) {
        int pageNumber = Integer.parseInt(StringUtils.defaultIfBlank(request.getParameter("pageNumber"), "1"));
        page.setPageNumber(pageNumber);
        int pageSize = Integer.parseInt(StringUtils.defaultIfBlank(request.getParameter("pageSize"), String.valueOf(PAGE_SIZE)));
        page.setPageSize(pageSize);
        int firstResult = page.getPageNumber() - 1;
        int maxResults = page.getPageSize();
        return new int[]{firstResult, maxResults};
    }

    public static Page init(BaseEntity entity){
        Page<BaseEntity> page = new Page<BaseEntity>().pageNumber(entity.getPageNumber()).pageSize(entity.getPageSize());
        entity.setPage(page);
        return page;
    }

}
