package com.syam.spring.micro.CountryMicroserviceExample;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syam.spring.micro.CountryMicroserviceExample.entities.Countries;
public interface CountriesRepository extends JpaRepository <Countries,String>
{
	

}
