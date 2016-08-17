package com.intuit.training.stockcommand;

import java.util.ArrayList;
import java.util.List;

public class Agent {

	public static final String BUYING_STOCK="buy";
	public static final String SELLING_STOCK="sell";
	public void placeOrder(String orderName){
		
		List<StockCommand> commands=new ArrayList<>();
		if(orderName==BUYING_STOCK){
			BuyingStock bs=new BuyingStock();
			bs.execute();
			commands.add(bs);
		}
		else if(orderName==SELLING_STOCK){
			SellingStock ss=new SellingStock();
			ss.execute();
			commands.add(ss);
		}
	}
}
