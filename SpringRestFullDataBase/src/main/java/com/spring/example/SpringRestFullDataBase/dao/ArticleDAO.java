package com.spring.example.SpringRestFullDataBase.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.example.SpringRestFullDataBase.entity.Article;

@Transactional
@Repository
public class ArticleDAO implements IArticleDAO
{
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getAllArticles()
	{
		String str="from Article as atcl ORDER BY atcl.articleId desc"; 
		return (List<Article>) entityManager.createQuery(str).getResultList();
	}
	
	@Override
	public Article getArticelById(int articleId)
	{
		return entityManager.find(Article.class, articleId);
	}
	
	@Override
	public void addArticle(Article article)
	{
		entityManager.persist(article);
		
	}
	
	@Override
	public void updateArticle(Article article)
	{
		Article arc1=getArticelById(article.getArticleId());
		arc1.setTitle(article.getTitle());
		arc1.setCategory(article.getCategory());
		entityManager.flush();
	}
	
	@Override
	public void deleteArticle(int articleId)
	{
		entityManager.remove(getArticelById(articleId));
	}
	
	@Override
	public boolean articleExists(String title,String category)
	{
		String hql = "FROM Article as atcl WHERE atcl.title = ? and atcl.category = ?";
		int count = entityManager.createQuery(hql).setParameter(1, title)
		              .setParameter(2, category).getResultList().size();
		return count > 0 ? true : false;
	}
	

}
