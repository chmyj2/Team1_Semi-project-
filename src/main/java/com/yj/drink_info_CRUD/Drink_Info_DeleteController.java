package com.yj.drink_info_CRUD;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sm.hc.AccountDAO;


@WebServlet("/Drink_Info_DeleteController")
public class Drink_Info_DeleteController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//삭제하는 일
		
		AccountDAO.loginCheck(request);
		DrinkDAO m = DrinkDAO.getDdao();
		m.delete_drink_info(request);
		m.Get_All_drink_Info(request);
		m.paging(1, request);
		
		request.setAttribute("contentPage", "jsp/yj/drink_Info_reg.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
