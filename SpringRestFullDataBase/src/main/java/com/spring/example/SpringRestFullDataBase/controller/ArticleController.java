package com.spring.example.SpringRestFullDataBase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.spring.example.SpringRestFullDataBase.entity.Article;
import com.spring.example.SpringRestFullDataBase.service.IArticleService;

@Controller
@RequestMapping("user")
public class ArticleController 
{
	@Autowired
	private IArticleService articelService;
	
	@GetMapping("article/{id}")
	public ResponseEntity<Article> getArticleById(@PathVariable("id") Integer Id)
	{
		Article article=articelService.getArticleById(Id);
		System.out.println(article+"article");
		return new ResponseEntity<Article>(article,HttpStatus.OK);
	}
	
	@GetMapping("articles")
	public ResponseEntity<List<Article>> getAllArticles()
	{
		List<Article> list=articelService.getAllArticles();
		System.out.println(list+"list");
		return new ResponseEntity<List<Article>>(list,HttpStatus.OK);
	}
	
	@PostMapping("article")
	public ResponseEntity<Void> addArticle(@RequestBody Article article,UriComponentsBuilder builder)
	{
		boolean flag=articelService.addArticle(article);
		if(flag==false)
		{
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			
		}
		HttpHeaders headers=new HttpHeaders();
		headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
	}
	
	@PutMapping("article")
	public ResponseEntity<Article> updateArticle(@RequestBody Article article)
	{
		articelService.updateArticle(article);
		return new ResponseEntity<Article>(article,HttpStatus.OK);
	}
	
	@DeleteMapping("article/{id}")
	public ResponseEntity<Void> deleteArticle(int articleId)
	{
		articelService.deleteArticle(articleId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
