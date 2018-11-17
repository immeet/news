package org.meet.service.Impl;

import org.meet.dao.NewsMapper;
import org.meet.pojo.Detail;
import org.meet.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("newsService")
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;
    @Override
    public int getDetailCount() {
        return newsMapper.getDetailCount();
    }

    @Override
    public List<Detail> getAllDetail(int pageNum, int pageSize) {
        List<Detail> list=null;
        list=newsMapper.getAllDetail(pageNum,pageSize);
        return list;
    }
}
