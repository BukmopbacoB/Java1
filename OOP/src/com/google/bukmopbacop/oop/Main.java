package com.google.bukmopbacop.oop;

import com.google.bukmopbacop.graph.Circle;
import com.google.bukmopbacop.graph.Point;
import com.google.bukmopbacop.graph.Shape;
import com.google.bukmopbacop.stuff.Person;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Serg";
		p.age = 49;

		
		Person p2 = new Person();
		p2.name = "Max";
		p2.age = 25;
		
		p.show();
		p2.show();
		
		
		Shape point1 = new Point();
		Shape point2 = new Point(1,1,"red");
		Shape circle1 = new Circle();
		Shape circle2 = new Circle(2,2,2,"green");
		Circle circle3 = new Circle();
		circle3.scale(2.5);
		
		Shape.drawScene();
		
//		Point po1 = new Point();
//		Point po2 = new Point(1, 1);
//		Point po3 = new Point(2, 2);
//		
//		Point.drawPoints();
////		byte b;
//		int i = 257;
//		double d = 323.142;
//		System.out.println("\nПреобразование int в byte.");
//		b = (byte) i;
//		System.out.println("i и b " + i + " " + b);
//		System.out.println("\nПреобразование double в int.");
//		i = (int) d;
//		System.out.println("d и i " + d + " " + i);
//		System.out.println("\nПреобразование double в byte.");
//		b = (byte) d;
//		System.out.println("d и b " + d + " " + b);
		
	}

}
