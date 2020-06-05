package com.syam.spring.micro.CountryMicroserviceEmxample1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syam.spring.micro.CountryMicroserviceEmxample1.entities.Countries;
public interface CountriesRepository extends JpaRepository <Countries,String>
{

}
