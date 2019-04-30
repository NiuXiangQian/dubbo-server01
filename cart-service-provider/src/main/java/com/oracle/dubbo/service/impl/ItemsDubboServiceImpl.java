package com.oracle.dubbo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oracle.dubbo.mapper.ItemsMapper;
import com.oracle.dubbo.model.Items;
import com.oracle.dubbo.service.ItemsDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 商品的业务层远程调用实现类
 * @Author: admin
 * @CreateDate: 2019/4/24 11:38
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/24 11:38
 * @UpdateRemark:
 * @Version: 1.0
 **/
@Service("itemsDubboService")
public class ItemsDubboServiceImpl implements ItemsDubboService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public PageInfo<Items> findOnePage(Integer pageNum, Integer pageSize) {

        pageNum = pageNum == null || pageNum <= 1 ? 1 : pageNum;
        pageSize = pageSize == null || pageSize <= 1 ? 5 : pageSize;
        //判断所查看的页数是否大于最后一页
        Long count = itemsMapper.findCount();
        Long l = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
        pageNum = (pageNum >= l) ? l.intValue() : pageNum;

        PageHelper.startPage(pageNum, pageSize);
        List<Items> items = itemsMapper.selectAll();

        return new PageInfo<>(items);
    }
}
