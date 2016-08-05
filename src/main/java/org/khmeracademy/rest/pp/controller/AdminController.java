package org.khmeracademy.rest.pp.controller;

import java.util.ArrayList;

import org.khmeracademy.rest.pp.entities.MainCategory;
import org.khmeracademy.rest.pp.services.MainCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@Autowired
	private MainCategoryService mainCategoryService;
	
	@RequestMapping(value="/maincategory" , method=RequestMethod.POST)
	public boolean save(@RequestBody MainCategory mainCategory){
		boolean status = mainCategoryService.save(mainCategory);
		return status;
	}

	@RequestMapping(value="/maincategory" , method=RequestMethod.PUT)
	public boolean update(@RequestBody MainCategory mainCategory){
		boolean status = mainCategoryService.update(mainCategory);
		return status;
	}
	@RequestMapping(value="/maincategory/{id}" , method=RequestMethod.DELETE)
	public boolean update(@PathVariable("id") int id){
		boolean status = mainCategoryService.remove(id);
		return status;
	}
	@RequestMapping(value="/maincategory", method = RequestMethod.GET)
	public ArrayList<MainCategory> findAll(){
		ArrayList<MainCategory> user = mainCategoryService.findAll();
		return user;
	}
}
