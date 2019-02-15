package com.demo.service.impl;

import com.demo.dao.CompanyActivityDAO;
import com.demo.entity.CompanyActivity;
import com.demo.entity.CompanyActivityExample;
import com.demo.service.HelloService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    private CompanyActivityDAO companyActivityDAO;

    @Override
    public String hello() {
        CompanyActivityExample example = new CompanyActivityExample();
        example.or().andIdIsNotNull();
        List<CompanyActivity> activities = companyActivityDAO.selectByExample(example);
        return "hello"+ activities.size();
    }
}
