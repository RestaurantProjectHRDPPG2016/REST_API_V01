package org.khmeracademy.rest.pp.entities;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class MainCategory {
	private int id;
	private String img1;
	private String img2;
	public MainCategory(){
		
	}
	public MainCategory(int id, String img1, String img2) {
		super();
		this.id = id;
		this.img1 = img1;
		this.img2 = img2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	
}
