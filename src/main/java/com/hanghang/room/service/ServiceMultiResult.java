package com.hanghang.room.service;

import java.util.List;

/**
 * 通用多结果Service返回结构
 */
public class ServiceMultiResult<T> {
    //总数
    private long total;
    //结果集
    private List<T> result;

    public ServiceMultiResult(long total, List<T> result) {
        this.total = total;
        this.result = result;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    //获取当前结果集
    public int getResultSize() {
        //如果为空，返回零
        if (this.result == null) {
            return 0;
        }
        return this.result.size();
    }
}

