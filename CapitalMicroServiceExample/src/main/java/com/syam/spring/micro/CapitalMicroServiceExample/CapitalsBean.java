package com.syam.spring.micro.CapitalMicroServiceExample;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CapitalsBean
{
	private String country;	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	private String name;
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
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	private String capital;
	private int port;	

}
