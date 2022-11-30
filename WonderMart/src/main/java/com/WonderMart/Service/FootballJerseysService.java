package com.WonderMart.Service;

import java.util.List;

import com.WonderMart.entity.FootballJerseysEntity;

public interface FootballJerseysService 
{
	FootballJerseysEntity saveFootballJerseys(FootballJerseysEntity footballJerseys);
	FootballJerseysEntity updateFootballJerseys(FootballJerseysEntity footballJerseys);
	void deleteFootballJerseys(FootballJerseysEntity footballJerseys);
	List<FootballJerseysEntity> findAllFootballJerseys();
	FootballJerseysEntity findFootballJerseyById(int Id);
}
