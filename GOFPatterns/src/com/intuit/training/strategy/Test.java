package com.intuit.training.strategy;

public class Test {

	public static void main(String[] args){
		SortStrategy strategy=new QuickSort();
		SearchEngine searchEngine=new SearchEngine(strategy);
		searchEngine.search();
	}
}
