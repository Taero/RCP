package com.starterkit.model;

public class BookTo {
	private String author;
	private String title;
	private long id;
	
	public BookTo(long id) {
		super();
		this.id = id;
	}
	
	public BookTo(long id, String title, String author) {
		super();
		this.author = author;
		this.title = title;
		this.id = id;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getId() {
		return id;
	}	
}
