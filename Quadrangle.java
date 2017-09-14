package ru.mail.redlin94;

public class Quadrangle extends Shape{
	private Point pointA;
	private Point pointB;
	private Point pointD;
	private Point pointC;
	
	public Quadrangle(Point pointA, Point pointB, Point pointD, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointD = pointD;
		this.pointC = pointC;
	}

	public Quadrangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public double getPerimetr() {
		double sideA = lengthBetweenPoints(pointA, pointB);
		double sideB = lengthBetweenPoints(pointB, pointC);
		double sideC = lengthBetweenPoints(pointC, pointD);
		double sideD = lengthBetweenPoints(pointD, pointA);
		
		return sideA+sideB+sideC+sideD;
	}
	
	public double getArea() {
		Triangle abc = new Triangle(pointA, pointB, pointC);
		Triangle adc = new Triangle(pointA, pointD, pointC);
		
		return abc.getArea()+adc.getArea();
		
	}
	
	@Override
	public String toString() {
		return "Quadrangle [pointA=" + pointA + ", pointB=" + pointB + ", pointD=" + pointD + ", pointC=" + pointC
				+ "]";
	}
	
	
	
}
