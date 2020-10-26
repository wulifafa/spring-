package com.lf.dao.impl;

import com.lf.dao.DemoDao;

import java.util.Arrays;
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
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa","bbb","ccc"); //此处应该模拟数据库
    }
}
