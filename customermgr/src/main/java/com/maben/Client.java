package com.maben;

import com.maben.pageutil.Page;
import com.maben.service.CustomerService;
import com.maben.vo.CustomerModel;
import com.maben.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Client {
    @Autowired
    private CustomerService customerService= null;
    public static void main(String[] args)throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Client c = (Client) applicationContext.getBean("client");
        CustomerModel customerModel = new CustomerModel();
        String key = Math.random()+"";
        customerModel.setCustomerId(key);
        customerModel.setPwd(key);
        customerModel.setRegisterTime("2020-02-13 12:00:00");
        customerModel.setShowName(key);
        customerModel.setTrueName(key);
        c.customerService.create(customerModel);

        CustomerQueryModel cqm = new CustomerQueryModel();
        cqm.getPage().setNowPage(2);

        Page<CustomerModel> page = c.customerService.getByConditionPage(cqm);
        System.out.println(page);

//        cqm.setShowName("2");
        Page<CustomerModel> page2 = c.customerService.getByConditionPage(cqm);
        System.out.println(page2);
    }
}
