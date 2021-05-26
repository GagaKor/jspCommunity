package com.koreait.container;

import com.koreait.controller.AdmMemberController;
import com.koreait.controller.UsrArticleController;
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
	public static UsrMemberController usrmemberController;
	public static AdmMemberController admMemberController;

	static {
		memberDao = new MemberDao();
		articleDao = new ArticleDao();

		memberService = new MemberService();
		articleService = new ArticleService();
		
		admMemberController = new AdmMemberController();
		usrmemberController = new UsrMemberController();
		articleController = new UsrArticleController();
	}
}