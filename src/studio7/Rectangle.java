package studio7;
import javax.swing.JOptionPane;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		length = 1;
		width = 1;
	}
	
	public Rectangle(int initLength, int initWidth) {
		length = initLength;
		width = initWidth;
	}

	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return 2.0 * length + 2.0 * width;
	}
	
	public String isBigger(Rectangle one, Rectangle two) {
		if (one.area() > two.area()) {
			return "The first rectangle is bigger.";
		}
		else {
			return "The second rectangle is bigger.";
		}
	}
	
	public String isSquare(Rectangle one) {
		if (one.getLength() == one.getWidth()) {
			return "The rectangle is a square! YAY :)";
		}
		else {
			return "The rectangle is not a square :(";
		}
	}
	
	public void drawRect(Rectangle one) {
		StdDraw.clear();
		StdDraw.setCanvasSize(10, 10);
		StdDraw.setYscale(0, 1);
		StdDraw.setXscale(0, 1);
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.rectangle(0.5, 0.5, one.getLength(), one.getWidth());
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public static void main(String[] args) {
		Rectangle one = new Rectangle(3, 4);
		Rectangle two = new Rectangle(2, 8);
		System.out.println(one.isSquare(one));
		System.out.println(one.isBigger(one, two));
		one.drawRect(one);
	}
}
