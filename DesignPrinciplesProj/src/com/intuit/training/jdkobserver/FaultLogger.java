package com.intuit.training.jdkobserver;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;
//concrete observer
public class FaultLogger implements Observer {
	private Logger logger=Logger.getLogger(this.getClass().getName());

	

	@Override
	public void update(Observable o, Object message) {
		// TODO Auto-generated method stub
		logger.info((String)message);
	}

}
