package com.oracle.controller;

import com.github.pagehelper.PageInfo;
import com.oracle.dubbo.model.Items;
import com.oracle.dubbo.service.ItemsDubboService;
import com.oracle.dubbo.vo.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 商品的控制器
 * @Author: admin
 * @CreateDate: 2019/4/18 16:20
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/18 16:20
 * @UpdateRemark:
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired(required = false)
    private ItemsDubboService itemsDubboService;

    @RequestMapping("/itemsShow")
    public String itemsShow(HttpServletRequest request, Integer pageNum, Integer pageSize) {

        PageInfo<Items> pageInfo = itemsDubboService.findOnePage(pageNum, pageSize);
        request.setAttribute("pageInfo", pageInfo);

        return "items/itemsList";
    }

    /**
     * @Description: 将数据库商品放入redis
     * @Author: admin
     * @Param: []
     * @Return java.lang.String
     **/
//    @RequestMapping("/putRedis")
//    @ResponseBody
    public ServerResponse<String> putRedis() {
        JedisPool jedisPool = new JedisPool();//占位
        Jedis resource = jedisPool.getResource();
        try {
//            List<Items> all = itemsDubboService.f();

//            for (Items items : all) {
////                String key = "items:" + items.getId();
////                Map<String, String> map = new HashMap<>();
////                map.put("id", items.getId().toString());
////                map.put("items_name", ParseNull.parseString(items.getItemsName()));
////                map.put("img_url", ParseNull.parseString(items.getImgUrl()));
////                map.put("price", ParseNull.parseString(items.getPrice()));
////                map.put("count", ParseNull.parseInteger(items.getCount(), 0).toString());
////                resource.hmset(key, map);
//            }
        } finally {
            resource.close();
        }


        return ServerResponse.createBySuccess("放入成功");
    }


}
