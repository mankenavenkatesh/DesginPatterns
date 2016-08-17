package com.intuit.training.ocpviolation;

public class GraphicUtility {
// This method logic has to change if new shape is introduced
	public void drawShape(Shape s){
		if(s.type==1){
			Circle c=(Circle)s;
			c.drawCircle();
		}
		else if(s.type==2){
			Rectangle r=(Rectangle)s;
			r.drawRectangle();
		}
	}
	
	
}
