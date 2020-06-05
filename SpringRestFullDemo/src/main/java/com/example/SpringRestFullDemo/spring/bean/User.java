package com.example.SpringRestFullDemo.spring.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User
{
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String country;
	private String name;
	
	public User(int id,String country,String name)
	{
		this.id=id;
		this.country=country;
		this.name=name;
		
	}
	
	public String toString()
	{
		return "name"+name;
	}

}
