package com.koreait.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.container.Container;
import com.koreait.controller.UsrArticleController;
import com.koreait.controller.UsrHomeController;
import com.koreait.controller.UsrMemberController;
import com.koreait.mysql.MysqlUtil;

@WebServlet("/usr/*")
public class UsrDispatcherServlet extends DispatcherServlet {
	
	
	@Override
	protected String doAction(HttpServletRequest req, HttpServletResponse resp, String controllerName,
			String actionMethodName) {
		String jspPath = null;
		
		if (controllerName.equals("home")) {
			UsrHomeController homeController = Container.homeController;
			if(actionMethodName.equals("main")) {
				jspPath = homeController.showMain(req, resp);
			}
		}
		
		if (controllerName.equals("member")) {
			UsrMemberController memberController = Container.memberController;
			System.out.println(actionMethodName);
			if (actionMethodName.equals("list")) {
				jspPath = memberController.showList(req, resp);
			} else if (actionMethodName.equals("join")) {
				jspPath = memberController.showJoin(req, resp);
			} else if (actionMethodName.equals("doJoin")) {
				jspPath = memberController.doJoin(req, resp);
			}else if (actionMethodName.equals("login")) {
				jspPath = memberController.showLogin(req, resp);
			} else if (actionMethodName.equals("doLogin")) {
				jspPath = memberController.doLogin(req, resp);
			}else if (actionMethodName.equals("doLogout")) {
				jspPath = memberController.doLogout(req, resp);
			}else if (actionMethodName.equals("getLoginIdDup")) {
				jspPath = memberController.getLoginIdDup(req, resp);
			}
		} else if (controllerName.equals("article")) {
			UsrArticleController articleController = Container.articleController;
			System.out.println(actionMethodName);
			if (actionMethodName.equals("list")) {
				jspPath = articleController.showList(req, resp);
			} else if (actionMethodName.equals("detail")) {
				jspPath = articleController.showDetail(req, resp);
			} else if (actionMethodName.equals("modify")) {
				jspPath = articleController.showModify(req, resp);
			} else if (actionMethodName.equals("doModify")) {
				jspPath = articleController.doModify(req, resp);
			} else if (actionMethodName.equals("write")) {
				jspPath = articleController.showWrite(req, resp);
			} else if (actionMethodName.equals("doWrite")) {
				jspPath = articleController.doWrite(req, resp);
			} else if (actionMethodName.endsWith("doDelete")) {
				jspPath = articleController.doDelete(req, resp);
			}

		}
		
		return jspPath;
	}
}