package com.example.factorydemo.pojo;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class PageBean<T> {
    //当前页数
    private int currentPage;
    //当前页显示的条数
    private int currentCount;
    //总页数
    private int totalPage;
    //总条数
    private int totalCount;
    //每页显示的数据
    private List<T> userList= new ArrayList<T>();

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getUserList() {
        return userList;
    }

    public void setUserList(List<T> userList) {
        this.userList = userList;
    }
}
