package com.intuit.training.commandpattern;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Button2 extends JButton implements Command{

	public Button2() {
		// TODO Auto-generated constructor stub
		setText("Button2");
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Button2 is preseend");
	}

	
}
