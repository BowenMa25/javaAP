package com.huaxia.project1.swing;

import javax.swing.JFrame;

public class DisplayImage extends JFrame{

	public DisplayImage() {
		super("my title");
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel p1 = new MyPanel();
		add(p1);
	}
	
	public static void main(String[] args) {
		DisplayImage di = new DisplayImage();
		di.setVisible(true);

	}

}
