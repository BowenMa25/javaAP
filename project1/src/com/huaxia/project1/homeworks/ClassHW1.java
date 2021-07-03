package com.huaxia.project1.homeworks;

/**
 * @see classHW1.md
 * 
 * @author John
 *
 */
public class ClassHW1 {

	public static void main(String[] args) {
		double r = 1;
//		Circle c = new Circle(); // using default constructor
//		System.out.println(c);
//		System.out.println("Is c an instance of Circle? " + (c instanceof Circle));
		
		Circle c1 = new Circle(r);
		System.out.println(c1);
		
		r = 2;
		Circle c2 = new Circle(r);
		System.out.println(c2);
	}

}

class Circle {
	double radius = 1.0;
	String color = "red";

	/*
	 * default constructor: 1. same name as class name; 2. no any arguments; 3. Java
	 * compiler may create it for;
	 */
	public Circle() { // you need this constructor if you defined other constructors
	}

	/*
	 * developer defined constructor with arguments
	 */
	public Circle(double r) { // constructor does NOT need return type, because it always return instance of Circle class.
		this.radius = r;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public String toString() {
//		return Double.toString(this.radius);
		return String.format("The circle area with radius=%.2f is %.2f.", this.radius, this.getArea()); // generate a string from double
	}
}
