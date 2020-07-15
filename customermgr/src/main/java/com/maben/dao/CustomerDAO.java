package com.maben.dao;

import com.maben.vo.CustomerModel;
import com.maben.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends BaseDao<CustomerModel,CustomerQueryModel>{

}
