package org.khmeracademy.rest.pp.services.impl;

import java.util.ArrayList;

import org.khmeracademy.rest.pp.entities.MainCategory;
import org.khmeracademy.rest.pp.repositories.MainCategoryRepository;
import org.khmeracademy.rest.pp.services.MainCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainCategoryServiceImpl implements MainCategoryService {
	@Autowired
	private MainCategoryRepository mainCategoryRepository;
	
	@Override
	public boolean remove(int id) {
		return mainCategoryRepository.remove(id);
	}

	@Override
	public boolean save(MainCategory mainCategory) {
		return mainCategoryRepository.save(mainCategory);
	}

	@Override
	public boolean update(MainCategory mainCategory) {
		return mainCategoryRepository.update(mainCategory);
	}

	@Override
	public ArrayList<MainCategory> findAll() {
		return mainCategoryRepository.findAll();
	}

}
