package com.maben.controller;

import com.maben.pageutil.Page;
import com.maben.service.GoodsService;
import com.maben.vo.GoodsModel;
import com.maben.vo.GoodsQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String toLogin(){
        Page<GoodsModel> page = goodsService.getByConditionPage(new GoodsQueryModel());
        System.out.println(page);
        return "/goods/index";
    }
}
