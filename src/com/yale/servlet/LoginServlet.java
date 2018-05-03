package com.yale.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 5114799099509367018L;

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//通过获取"do"参数，来处理不同的请求
		String dos = request.getParameter("do");  
        if (dos == null || dos.equals("")) {  
            dos = "login";  
        }
        
        //登录页面
        if("login".equals(dos)){
        	 //sendRedirect方式不能直接访问WEB-INF下的页面
        	 //response.sendRedirect("WEB-INF/pages/login/login.jsp");
        	request.getRequestDispatcher("WEB-INF/pages/login/login.jsp").forward(request, response);
             return;
        }
	}

}
