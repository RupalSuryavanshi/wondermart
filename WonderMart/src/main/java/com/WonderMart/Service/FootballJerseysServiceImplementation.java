package com.WonderMart.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WonderMart.Repository.FootballJerseysRepository;
import com.WonderMart.entity.FootballJerseysEntity;

@Service
public class FootballJerseysServiceImplementation implements FootballJerseysService {

	@Autowired
	private FootballJerseysRepository repo;
	@Override
	public FootballJerseysEntity saveFootballJerseys(FootballJerseysEntity footballJerseys) {
		
		return repo.save(footballJerseys);
	}

	@Override
	public FootballJerseysEntity updateFootballJerseys(FootballJerseysEntity footballJerseys) {
		
		return repo.save(footballJerseys);
	}

	@Override
	public void deleteFootballJerseys(FootballJerseysEntity footballJerseys) {
		repo.delete(footballJerseys);

	}

	@Override
	public List<FootballJerseysEntity> findAllFootballJerseys() {
		
		return repo.findAll();
	}

	@Override
	public FootballJerseysEntity findFootballJerseyById(int Id) {
		
		return repo.findById(Id).get();
	}

}
