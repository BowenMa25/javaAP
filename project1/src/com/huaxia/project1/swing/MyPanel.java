package com.huaxia.project1.swing;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private Image card;
	private int x = 10;
	private int y = 10;
	
	public void paint(Graphics g) {
//		Toolkit t = Toolkit.getDefaultToolkit();
//		URL url = this.getClass().getResource("clubA.png");
//		card = t.getImage(url);
		InputStream is = MyPanel.class.getResourceAsStream("Forest.jpg");
		try {
			card = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(card, x, y, this);
	}
}
