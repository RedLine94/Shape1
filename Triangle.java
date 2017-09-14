package ru.mail.redlin94;

public class Triangle extends Shape {
	private Point PointA;
	private Point PointB;
	private Point PointC;
	
	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.PointA = pointA;
		this.PointB = pointB;
		this.PointC = pointC;
	}

	public Triangle() {
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

	public Point getPointC() {
		return PointC;
	}

	public void setPointC(Point pointC) {
		this.PointC = pointC;
	}

	public double getArea() {
		double sideAB = lengthBetweenPoints(PointA, PointB);
		double sideBC = lengthBetweenPoints(PointB, PointC);
		double sideCA = lengthBetweenPoints(PointC, PointA);
		
		if ((sideAB+sideBC <= sideCA) || (sideCA+sideAB <= sideBC) || (sideBC+sideCA <= sideAB)) {
			System.out.println("Triangle does not exist.");
			return -1;
		} else {
			double semiperimetr = (sideAB + sideBC + sideCA ) / 2;
			double Area = Math.sqrt(semiperimetr*(semiperimetr-sideAB)+(semiperimetr-sideBC)+(semiperimetr-sideCA));
			
			return Area;
		}
	}
	
	public double getPerimetr() {
		
		double sideAB = lengthBetweenPoints(PointA, PointB);
		double sideBC = lengthBetweenPoints(PointB, PointC);
		double sideCA = lengthBetweenPoints(PointC, PointA);
		
		if ((sideAB+sideBC < sideCA) || (sideCA+sideAB < sideBC) || (sideBC+sideCA < sideAB)) {
			System.out.println("Triangle does not exist.");
			return -1;
		} else {
			double perimetr = sideAB + sideBC + sideCA;
			
			return perimetr;
		}
		
	}
	
	

	@Override
	public String toString() {
		return "Triangle [PointA=" + PointA + ", PointB=" + PointB + ", PointC=" + PointC + "]";
	}
	
	
}
