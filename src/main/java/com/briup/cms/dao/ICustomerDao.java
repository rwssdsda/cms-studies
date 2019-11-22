package com.briup.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.briup.cms.bean.Customer;

public interface ICustomerDao extends JpaRepository<Customer,Integer> {
    Customer queryById(int id);
}
