package org.meet.controller;

import com.alibaba.fastjson.JSON;
import org.meet.pojo.Page;
import org.meet.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class NewsController {
    @Resource
    private NewsService newsService;

    @RequestMapping("/getAllDetail")
    @ResponseBody
    public String getAllDetail(@RequestParam(value = "pageNum",defaultValue = "0",required = false) int pageNum){
        Page page=new Page();
        int count = newsService.getDetailCount();

        page.setCount(count);
        page.setTotal(count);
        page.setPageNum(pageNum);

        List list = newsService.getAllDetail((page.getPageNum() - 1) * page.getPageSize(), page.getPageSize());
        list.add(page);
        String str=JSON.toJSONString(list);
        return str;
    }
}
