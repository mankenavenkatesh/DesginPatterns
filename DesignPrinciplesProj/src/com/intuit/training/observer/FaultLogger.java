package com.intuit.training.observer;

import java.util.logging.Logger;
//concrete observer
public class FaultLogger implements FaultListener {
	private Logger logger=Logger.getLogger(this.getClass().getName());

	@Override
	public void handleFault(String message) {
		// TODO Auto-generated method stub
		logger.info(message);
		
	}

}
