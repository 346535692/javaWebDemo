package testa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {  //需要继承HttpServlet  并重写doGet  doPost方法
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);  //将信息使用doPost方法执行   对应jsp页面中的form表单中的method
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name"); //得到jsp页面传过来的参数
        System.out.println(name);
        String pwd = request.getParameter("pwd");
        System.out.println(pwd);
        request.setAttribute("xiaoxi", "欢迎用户"+name); //向request域中放置信息
        request.getRequestDispatcher("/outPage.jsp").forward(request, response);//转发到成功页面
//        response.sendRedirect("index.jsp"); //重定向到首页

    }

}