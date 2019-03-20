package com.tibco.bw.qotd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class QuoteCollection implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

	ArrayList<Quote> al = new ArrayList<Quote>();

	
	public QuoteCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void add(String quote, String author) {
		Quote q = new Quote();	
		q.author = author;
		q.quote = quote;
		al.add(q);		
	}
	
	public Quote get() {
		
		int randomNum = ThreadLocalRandom.current().nextInt(0, al.size() );
		
		return al.get(randomNum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}	

	
}
