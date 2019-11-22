package com.briup.cms.service.Impl;

import com.briup.cms.bean.Customer;
import com.briup.cms.dao.ICustomerDao;
import com.briup.cms.service.ICustomerService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 */
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerDao customerDao;
    @Override
    public Customer findById(int id) {
        return customerDao.queryById(id);
    }
    @PostMapping("/query")
    @ApiOperation("正在测试两个参数")
    @ApiImplicitParams({@ApiImplicitParam(name = "id",value = "客户id",required = true,
            paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "name",value = "客户名字",paramType = "query",dataType = "String")})
    public String queryH(int id,String name){

        return "c";
    }
    @GetMapping("/query")
    @ApiOperation("测试参数为一个对象")
    public Customer queryQ(Customer customer){
       return customer;
    }
}
