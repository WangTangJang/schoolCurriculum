package com.easyBuy.mybatisWithSpring.servlet;
import com.easyBuy.mybatisWithSpring.service.EasyBuyUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value="/EasyBuyUserServlet",loadOnStartup = 1)
public class EasyBuyUserServlet extends HttpServlet {

    EasyBuyUserService easyBuyUserService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ApplicationContext ap=new ClassPathXmlApplicationContext("/applicationContext.xml");
        easyBuyUserService=(EasyBuyUserService)ap.getBean("easyBuyUserServiceImpl");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String op=request.getParameter("op");
        switch (op)
        {
            case "findAll":
                findAll(request,response);
                break;
        }
    }
    protected void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List list=easyBuyUserService.findAll();
            request.setAttribute("list",list);
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

