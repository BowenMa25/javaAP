package com.huaxia.project1.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AddButton {

	public static void main(String[] args) {
		JFrame f = new JFrame("My window");
		f.setSize(640, 480);
	
		JButton btn1 = new JButton("Click");
		btn1.setBounds(100, 100, 100, 40);
//		MyButtonAction action = new MyButtonAction();
		btn1.addActionListener(new ActionListener() {// anonymous class

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("my button is clicked...");
				
			}
			
		});
//		btn1.addActionListener(action);
		f.add(btn1);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	

}

class MyButtonAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("My button is clicked on MyButtonAction class...");
		
	}
}
