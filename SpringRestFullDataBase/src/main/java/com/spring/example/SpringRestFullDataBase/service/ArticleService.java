package com.spring.example.SpringRestFullDataBase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.example.SpringRestFullDataBase.dao.IArticleDAO;
import com.spring.example.SpringRestFullDataBase.entity.Article;

@Service
public class ArticleService implements IArticleService
{
	@Autowired
	private IArticleDAO articleDao;
	
	@Override
	public Article getArticleById(int articleId)
	{
		Article obj=articleDao.getArticelById(articleId);
		return obj;
		
	}
	
	@Override
	public List<Article> getAllArticles()
	{
		return articleDao.getAllArticles();
	}
	
	@Override
	public synchronized boolean addArticle(Article article)
	{
		if(articleDao.articleExists(article.getTitle(), article.getCategory()))
		{
			return false;
		}
		else
		{
			articleDao.addArticle(article);
			return true;
		}
		
	}
	
	@Override
	public void updateArticle(Article article)
	{
		
		articleDao.updateArticle(article);
	}
	
	@Override
	public void deleteArticle(int articleId)
	{
		 articleDao.deleteArticle(articleId);
		
	}

}
