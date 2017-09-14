package ru.mail.redlin94;

public abstract class Shape {
	abstract double getArea();
	abstract double getPerimetr();
	
	public double lengthBetweenPoints(Point a, Point b) {
		return Math.sqrt(Math.pow(b.getX()-a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
	}
}
