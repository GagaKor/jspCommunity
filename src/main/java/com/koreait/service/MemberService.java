package com.koreait.service;

import java.util.List;
import java.util.Map;

import com.koreait.container.Container;
import com.koreait.dao.MemberDao;
import com.koreait.dto.Member;

public class MemberService {

	private MemberDao memberDao;

	public MemberService() {
		memberDao = Container.memberDao;
	}

	public List<Member> getForPrintMembers() {
		return memberDao.getForPrintMembers();
	}

	public int join(Map<String, Object> joinArgs) {
		
		return memberDao.join(joinArgs);
	}

	public Member getMemberByLoginId(String loginId) {
		return memberDao.getMemberbyLoginId(loginId);

	}

	public Member getMemberById(int id) {
		return memberDao.getMemberByLoginId(id);
	}

}

