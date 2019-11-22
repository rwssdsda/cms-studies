package com.briup.cms.web.controller;

import com.briup.cms.bean.Customer;
import com.briup.cms.service.ICustomerService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "客户相关接口")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/queryById")
    @ApiOperation("根据客户id查询" )
    @ApiImplicitParam(name="id",value = "客户id",paramType = "query",dataType = "int",required = true)
    public Customer queryById(int id){
        return customerService.findById(id);
    }

    @PostMapping("/queryH")
    @ApiOperation("正在测试两个")
    public String queryH(){
        return "c";
    }
    @GetMapping("queryL")
    @ApiOperation("测试自定义响应结构")
    public Message<Customer> queryL(Customer customer){
        return MessageUtil.success(customer);
    }
}
