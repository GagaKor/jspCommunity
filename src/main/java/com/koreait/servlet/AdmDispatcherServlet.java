package com.koreait.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.container.Container;
import com.koreait.controller.AdmMemberController;
import com.koreait.mysql.MysqlUtil;

@WebServlet("/adm/*")
public class AdmDispatcherServlet extends DispatcherServlet {
	
	
	@Override
	protected String doAction(HttpServletRequest req, HttpServletResponse resp, String controllerName,
			String actionMethodName) {
		String jspPath=null;
		if (controllerName.equals("member")) {
			AdmMemberController memberController = Container.admMemberController;

			if (actionMethodName.equals("list")) {
				jspPath = memberController.showList(req, resp);
			}
		}
		return jspPath;
	}

}