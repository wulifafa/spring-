package com.lf.servlet;

import com.lf.dao.DemoDao;
import com.lf.service.DemoService;
import com.lf.service.impl.DemoSeviceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/26
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@WebServlet(urlPatterns = "/demo1")
public class DemoServlet extends HttpServlet {

    DemoService demoService=new DemoSeviceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(demoService.findAll().toString());
    }
}
