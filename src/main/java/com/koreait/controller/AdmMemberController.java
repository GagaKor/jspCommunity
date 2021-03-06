package com.koreait.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.container.Container;
import com.koreait.dto.Member;
import com.koreait.service.MemberService;

public class AdmMemberController {
	private MemberService memberService;

	public AdmMemberController() {
		memberService = Container.memberService;
	}

	public String showList(HttpServletRequest req, HttpServletResponse resp) {
		List<Member> members = memberService.getForPrintMembers();

		req.setAttribute("members", members);

		return "adm/member/list";
	}
}