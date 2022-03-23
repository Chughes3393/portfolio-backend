package com.portfoliobackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quotes")

public class Quotes {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int key;
	@Column
	private String quote;
	@Column
	private String from1;
	
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getFrom1() {
		return from1;
	}
	public void setFrom1(String from1) {
		this.from1 = from1;
	}

}
