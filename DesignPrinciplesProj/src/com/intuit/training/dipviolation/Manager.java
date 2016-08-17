package com.intuit.training.dipviolation;

public class Manager {

	private Worker worker;
	
	public void setWorker(Worker worker){
		this.worker=worker;
	}
	
	public void manage(){
		worker.work();
	}
}
