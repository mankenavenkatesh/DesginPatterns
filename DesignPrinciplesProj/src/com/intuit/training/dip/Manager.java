package com.intuit.training.dip;

public class Manager {

	private WorkerInterface worker;
	
	public void setWorker(WorkerInterface worker){
		this.worker=worker;
	}
	
	public void manage(){
		worker.work();
	}
}
