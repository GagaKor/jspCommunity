package com.koreait.service;


import java.util.List;
import java.util.Map;

import com.koreait.container.Container;
import com.koreait.dao.ArticleDao;
import com.koreait.dto.Article;
import com.koreait.dto.Board;


public class ArticleService {
	private ArticleDao articleDao;

	public ArticleService() {
		articleDao = Container.articleDao;
	}

	public List<Article> getForPrintArticlesByBoardId(int boardId) {
		return articleDao.getForPrintArticlesByBoardId(boardId);
	}
	public Article getForPrintArticleById(int id) {
		return articleDao.getForPrintArticleById(id);
	}
	public Board getBoardById(int id) {
		return articleDao.getBoardById(id);
	}
	public int write(Map<String, Object> args) {
		return articleDao.write(args);
	}

	public int delete(int id) {
		return articleDao.delete(id);
	}

	public int modify(Map<String, Object> args) {	
		return articleDao.modify(args);
	}
}