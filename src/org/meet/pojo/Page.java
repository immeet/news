package org.meet.pojo;

public class Page {
    private int pageNum;
    private int pageSize=2;
    private int total;
    private int count;

    public Page() {
    }

    public Page(int pageNum, int total, int count) {
        this.pageNum = pageNum;
        this.total = total;
        this.count = count;
    }

    public Page(int pageNum, int pageSize, int total, int count) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.count = count;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum<=0) {
            this.pageNum = 1;
        }else if (pageNum>=total){
            this.pageNum = total;
        }else{
            this.pageNum = pageNum;
        }
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        total=(count%pageSize!=0)?(count/pageSize+1):(count/pageSize);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
