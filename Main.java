package ru.mail.redlin94;

public class Main {

	public static void main(String[] args) {
			
		Point a = new Point(-7, -3);
		Point b = new Point(7, 3);
		Point c = new Point(51, 4);
		Point d = new Point(1, 1);
		
		Triangle triagle = new Triangle(a, b, c);
		Circle circle = new Circle(c,d);
		Quadrangle quadrangle = new Quadrangle(a, b, d, c);
		
		System.out.println(triagle);
		System.out.println(triagle.getArea());
		System.out.println(triagle.getPerimetr());
		System.out.println('\n');
		
		System.out.println(circle);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimetr());
		System.out.println('\n');
		
		System.out.println(quadrangle);
		System.out.println(quadrangle.getArea());
		System.out.println(quadrangle.getPerimetr());
		
	}

}
