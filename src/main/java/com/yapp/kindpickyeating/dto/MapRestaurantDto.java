package com.yapp.kindpickyeating.dto;

public class MapRestaurantDto {

	private Long id;
	private String name;
	private String address;
	private String grade;
	private String thumb;
	private Double latatitue;
	private Double longitute;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Double getLatatitue() {
		return latatitue;
	}
	public void setLatatitue(Double latatitue) {
		this.latatitue = latatitue;
	}
	public Double getLongitute() {
		return longitute;
	}
	public void setLongitute(Double longitute) {
		this.longitute = longitute;
	}
	
	
}
