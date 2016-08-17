package com.intuit.training.commandpattern;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{

	private JButton b1,b2;
	public MyFrame() throws HeadlessException{
		// TODO Auto-generated constructor stub
		super();
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Button1 b1=new Button1();
		Button2 b2=new Button2();
		setLayout(new FlowLayout());
		MyListener listener=new MyListener();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		add(b1);
		add(b2);
	}
	
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			Command cmd=(Command)e.getSource();
			cmd.execute();
		}
		
	}
}


