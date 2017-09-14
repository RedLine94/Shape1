package ru.mail.redlin94;

public class Circle extends Shape {
	private Point PointA;
	private Point PointB;
	
	public Circle(Point pointA, Point pointB) {
		super();
		this.PointA = pointA;
		this.PointB = pointB;
	}

	public Circle() {
		super();
	}

	public Point getPointA() {
		return PointA;
	}

	public void setPointA(Point pointA) {
		this.PointA = pointA;
	}

	public Point getPointB() {
		return PointB;
	}

	public void setPointB(Point pointB) {
		this.PointB = pointB;
	}
	
	public double getRadius (Point a, Point b) {
		double radius = lengthBetweenPoints(a, b);
		return radius;
	}
	
	public double getPerimetr() {
		return 2*Math.PI*getRadius(PointA, PointB);
	}
	
	public double getArea() {
		return Math.PI*Math.pow(getRadius(PointA, PointB), 2);
	}

	@Override
	public String toString() {
		return "Circle [PointA=" + PointA + ", PointB=" + PointB + "]";
	}
	
	
}
