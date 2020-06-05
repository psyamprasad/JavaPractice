package com.spring.example.SpringRestFullDataBase.service;

import java.util.List;

import com.spring.example.SpringRestFullDataBase.entity.Article;

public interface IArticleService
{
  
	List<Article> getAllArticles();
	Article getArticleById(int articleId);
	boolean addArticle(Article article);
	void updateArticle(Article article);
	void deleteArticle(int articleId);
	
}
