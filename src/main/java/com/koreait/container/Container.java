package com.koreait.container;

import com.koreait.controller.AdmMemberController;
import com.koreait.controller.UsrArticleController;
import com.koreait.controller.UsrHomeController;
import com.koreait.controller.UsrMemberController;
import com.koreait.dao.ArticleDao;
import com.koreait.dao.MemberDao;
import com.koreait.service.ArticleService;
import com.koreait.service.MemberService;


public class Container {
	public static ArticleService articleService;
	public static ArticleDao articleDao;
	public static UsrArticleController articleController;

	public static MemberDao memberDao;
	public static MemberService memberService;
	public static UsrMemberController memberController;
	public static AdmMemberController admMemberController;
	public static UsrHomeController homeController;

	static {
		memberDao = new MemberDao();
		articleDao = new ArticleDao();

		memberService = new MemberService();
		articleService = new ArticleService();
		
		admMemberController = new AdmMemberController();
		memberController = new UsrMemberController();
		articleController = new UsrArticleController();
		homeController = new UsrHomeController();
	}
}