package com.intuit.training.withoutcommand;

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
		b1=new JButton("Button1");
		b2=new JButton("Button2");
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
			Object o=e.getSource();
			if(o==b1){
				JOptionPane.showMessageDialog(null, "Button1 is pressed");
			}
			else if(o==b2){
				JOptionPane.showMessageDialog(null, "Button2 is pressed");
			}
		}
		
	}
}


