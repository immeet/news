package org.meet.service;

import org.meet.pojo.Detail;

import java.util.List;

public interface NewsService {
    public int getDetailCount();

    public List<Detail> getAllDetail(int pageNum,int pageSize);


}
