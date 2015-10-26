package com.felab.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by azheng on 10/26/2015.
 */
public class Page implements Serializable {

    // 每页默认显示条数
    private static int DEFAULT_PAGE_SIZE = 20;

    // 每页显示条数
    private int pageSize = DEFAULT_PAGE_SIZE;

    // 起始页码
    private long start;

    // 分页对象存取的列表数据
    private List data;

    // 数据总数
    private long totalCount;

    public Page() {
        this(DEFAULT_PAGE_SIZE, 0, new ArrayList(), 0);
    }

    public Page(int pageSize, long start, List data, long totalCount) {
        this.pageSize = pageSize;
        this.start = start;
        this.data = data;
        this.totalCount = totalCount;
    }

    /**
     * 获取总页数
     * @return
     */
    public long getTotalPageCount() {
        if (totalCount % pageSize == 0) {
            return totalCount / pageSize;
        } else {
            return totalCount / pageSize + 1;
        }
    }

    /**
     * 获取当前页码
     * @return
     */
    public long getCurrentPageNo() {
        return start / pageSize + 1;
    }

    /**
     * 判断是否有下一页
     * @return
     */
    public boolean isHasNextPage() {
        return this.getCurrentPageNo() < this.getTotalPageCount();
    }

    /**
     * 判断是否有上一页
     * @return
     */
    public boolean isHasPreviousPage() {
        return this.getCurrentPageNo() > 1;
    }
}
