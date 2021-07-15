package com.huaxia.project1.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AddTextField {

	public static void main(String[] args) {
		JFrame f = new JFrame("My window");
		f.setSize(640, 480);
	
		JTextField txt1 = new JTextField();
		txt1.setBounds(100, 50, 100, 40);
		f.add(txt1);
		
		JButton btn1 = new JButton("Click");
		btn1.setBounds(100, 100, 100, 40);
//		MyButtonAction action = new MyButtonAction();
		btn1.addActionListener(new ActionListener() {// anonymous class

			@Override
			public void actionPerformed(ActionEvent e) {
				txt1.setText("Hello John.");
				
			}
			
		});
//		btn1.addActionListener(action);
		f.add(btn1);
		
		f.setResizable(false);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);	}

}
