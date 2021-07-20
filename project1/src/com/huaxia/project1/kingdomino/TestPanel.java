package com.huaxia.project1.kingdomino;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.huaxia.project1.kingdomino.Terrain.TerrainImage;

public class TestPanel extends JPanel{
	public void paint(Graphics g) {
		Terrain t = new Terrain(TerrainImage.WATER, 2);
		Image img = Terrain.getImage(t.imageEnum);
		g.drawImage(img, 10, 10, this);
	}

	public static void main(String[] args) {
		JFrame f = new JFrame("My window");
		f.setSize(640, 480);
		f.add(new TestPanel());
		f.setVisible(true);

	}

}
