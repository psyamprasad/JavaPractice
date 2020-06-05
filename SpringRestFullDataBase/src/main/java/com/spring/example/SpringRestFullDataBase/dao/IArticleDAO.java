package com.spring.example.SpringRestFullDataBase.dao;

import java.util.List;

import com.spring.example.SpringRestFullDataBase.entity.Article;

public interface IArticleDAO 
{
	
	List<Article> getAllArticles();
	Article getArticelById(int articleId);
	void addArticle(Article article);
	void updateArticle(Article articel);
	void deleteArticle(int articelId);
	boolean articleExists(String title,String category);
	

}
