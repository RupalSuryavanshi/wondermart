package com.WonderMart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WonderMart.entity.FootballJerseysEntity;

@Repository
public interface FootballJerseysRepository extends JpaRepository<FootballJerseysEntity, Integer> 
{
	
}
