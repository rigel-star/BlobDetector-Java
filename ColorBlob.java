package com.java_face_detection;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class ColorBlob {

	int x;
	int y;
	public BufferedImage src;
	
	public ColorBlob(BufferedImage src, int x, int y) {
		this.x = x;
		this.y = y;
		this.src = src;
	}
	
	public void show() {
		Graphics2D g2d = src.createGraphics();
		g2d.draw(new Rectangle2D.Double(x, y, 50, 50));
	}
	
	
	
}
