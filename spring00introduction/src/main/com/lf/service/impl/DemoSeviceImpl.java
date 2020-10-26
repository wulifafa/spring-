package com.lf.service.impl;

import com.lf.BeanFactory;
import com.lf.dao.DemoDao;
import com.lf.dao.impl.DemoDaoImpl;
import com.lf.service.DemoService;

import java.util.List;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/26
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class DemoSeviceImpl implements DemoService {

    private DemoDao demoDao= (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }

    public DemoSeviceImpl(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }
}
