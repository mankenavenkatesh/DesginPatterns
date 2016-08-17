package com.intuit.training.strategy;

public class SearchEngine {

	private SortStrategy strategy;
	
	public SearchEngine(SortStrategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy=strategy;
	}
	
	public void search(){
		strategy.sort();
		System.out.println("search logic after sorting");
	}
	
}
