package com.maben.service.impl;

import com.maben.dao.CustomerDAO;
import com.maben.service.BaseServiceImpl;
import com.maben.service.CustomerService;
import com.maben.vo.CustomerModel;
import com.maben.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerModel, CustomerQueryModel> implements CustomerService  {

    private CustomerDAO customerDAO = null;
    @Autowired
    public void setCustomerDAO(CustomerDAO customerDAO){
        this.customerDAO = customerDAO;
        super.setBaseDao(customerDAO);
    }
}
