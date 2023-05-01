package com.Amarnath.learnspringboot.cources.bean;

public class Courses2 {

	private int id;
	private String course;
	private String author;

	public Courses2(int id, String course, String author) {
		super();
		this.id = id;
		this.course = course;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public String getCourse() {
		return course;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Courses2 [id=" + id + ", course=" + course + ", author=" + author + "]";
	}

}
