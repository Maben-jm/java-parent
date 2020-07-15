package com.maben;

import com.maben.pageutil.Page;
import com.maben.service.GoodsService;
import com.maben.vo.GoodsModel;
import com.maben.vo.GoodsQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Client {
    @Autowired
    private GoodsService goodsService= null;
    public static void main(String[] args)throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Client c = (Client) applicationContext.getBean("client");
        GoodsModel goodsModel = new GoodsModel();
        String key = Math.random()+"";
        goodsModel.setName(key);
        goodsModel.setImgPath(key);
        goodsModel.setDescription(key);
        c.goodsService.create(goodsModel);

        GoodsQueryModel cqm = new GoodsQueryModel();
        cqm.getPage().setNowPage(2);

        Page<GoodsModel> page = c.goodsService.getByConditionPage(cqm);
        System.out.println(page);

//        cqm.setShowName("2");
        Page<GoodsModel> page2 = c.goodsService.getByConditionPage(cqm);
        System.out.println(page2);
    }
}
