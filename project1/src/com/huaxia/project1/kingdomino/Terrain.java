package com.huaxia.project1.kingdomino;

import java.awt.Image;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class Terrain {
	enum TerrainImage {EMPTY, FOREST, FIELD, MINE, SWAMP, MOUNTAIN, WATER, CASTLE}
	static Image imgForest, imgField, imgMine, imgSwamp, imgMountain, imgWater;
	TerrainImage imageEnum;
	int numberOfCrown;
	
	static {
		try {
			InputStream is = Terrain.class.getResourceAsStream("Forest.jpg");
			imgForest = ImageIO.read(is);
			is = Terrain.class.getResourceAsStream("Field.jpg");
			imgField = ImageIO.read(is);
			is = Terrain.class.getResourceAsStream("Mine.jpg");
			imgMine = ImageIO.read(is);
			is = Terrain.class.getResourceAsStream("Swamp.jpg");
			imgSwamp = ImageIO.read(is);
			is = Terrain.class.getResourceAsStream("Mountain.jpg");
			imgMountain = ImageIO.read(is);
			is = Terrain.class.getResourceAsStream("Water.jpg");
			imgWater = ImageIO.read(is);
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	Terrain(TerrainImage imageEnum, int numberCrown){
		this.numberOfCrown = numberCrown;
		this.imageEnum = imageEnum;
	}
	
	
	// return null if not exist
	static Image getImage(TerrainImage imageName) {
		switch(imageName) {
		case FOREST:
			return imgForest;	
		case FIELD:
			return imgField;	
		case MINE:
			return imgMine;	
		case SWAMP:
			return imgSwamp;	
		case MOUNTAIN:
			return imgMountain;	
		case WATER:
			return imgWater;	
		default:
			return null;
		}
	}
	public int getNumberOfCrown() {
		return numberOfCrown;
	}

	public void setNumberOfCrown(int numberOfCrown) {
		this.numberOfCrown = numberOfCrown;
	}

	
	@Override
	public String toString() {
		return "Terrain [" + imageEnum + "," + numberOfCrown + "]";
	}

	public static void main(String[] args) {
		Terrain t1 = new Terrain(TerrainImage.FOREST, 2);
		System.out.println(t1);
	}

}
