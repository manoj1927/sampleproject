package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Library {
	@Id
	private int bookid;
	private String bookname;
	@OneToOne
	private Student std;
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
    public Library()
    {
    	
    }
}
