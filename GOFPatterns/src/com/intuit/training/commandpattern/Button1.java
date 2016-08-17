package com.intuit.training.commandpattern;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Button1 extends JButton implements Command{

	public Button1() {
		// TODO Auto-generated constructor stub
		setText("Button1");
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Button1 is Pressed");
	}

}
