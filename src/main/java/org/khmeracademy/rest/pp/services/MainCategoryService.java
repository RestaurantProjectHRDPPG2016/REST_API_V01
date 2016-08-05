package org.khmeracademy.rest.pp.services;

import java.util.ArrayList;

import org.khmeracademy.rest.pp.entities.MainCategory;

public interface MainCategoryService {
	boolean remove(int id);
	boolean save(MainCategory mainCategory);
	boolean update(MainCategory mainCategory);
	ArrayList<MainCategory> findAll();
}
