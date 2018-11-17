package org.meet.dao;

import org.apache.ibatis.annotations.Param;
import org.meet.pojo.Detail;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("newsMapper")
public interface NewsMapper {
    public int getDetailCount();

    public List<Detail> getAllDetail(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
}
