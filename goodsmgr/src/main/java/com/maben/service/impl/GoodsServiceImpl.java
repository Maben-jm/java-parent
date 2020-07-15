package com.maben.service.impl;

import com.maben.dao.GoodsDAO;
import com.maben.service.BaseServiceImpl;
import com.maben.service.GoodsService;
import com.maben.vo.GoodsModel;
import com.maben.vo.GoodsQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends BaseServiceImpl<GoodsModel, GoodsQueryModel> implements GoodsService {

    private GoodsDAO goodsDAO = null;
    @Autowired
    public void setCustomerDAO(GoodsDAO goodsDAO){
        this.goodsDAO = goodsDAO;
        super.setBaseDao(goodsDAO);
    }
}
