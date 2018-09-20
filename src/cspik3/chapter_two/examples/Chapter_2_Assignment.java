package cspik3.chapter_two.examples;

import static java.lang.System.out;

/**
 * @author chloe.spilker
 * 9/18/18
 */

public class Chapter_2_Assignment {

	public static void main(String[] args) {
		
		// individual coding
		out.println("INDIVIDUAL CODING SECTION");
		out.println("-------------------------");
		out.println("");
		
		// 1.
		out.println("Welcome to Java");
		out.println("Welcome to Computer Science");
		out.println("Programming is fun");
		out.println("");
		
		// 2.
		out.println("Java");
		out.println("Java");
		out.println("Java");
		out.println("Java");
		out.println("Java");
		out.println("");
		
		// 3. 
		out.println("'None won!' - Brandon Barney's broken game");
		out.println("");
		
		// 4.
		out.println("|  a  | a^2 | a^3 |\r\n" + 
				"|-----|-----|-----|\r\n" + 
				"|  1  |  1  |  1  |\r\n" + 
				"|  2  |  4  |  8  |\r\n" + 
				"|  3  |  9  | 27  |\r\n" + 
				"|  4  | 16  | 24  |");
		out.println("");
		
		// "group" coding
		out.println("GROUP SECTION");
		out.println("-------------");
		out.println("");
		
		// Area and Perimeter of a Circle
		out.println("The radius of a circle is 5.5");
		double radius = 5.5;
		double PI = 3.14159;
		double perimeter = 2 * radius * PI;
		double area = radius * radius * PI;
		out.println("The area of this circle is " + area + " and the perimeter is " + perimeter);
		out.println("");
		
		// Average Speed in Miles
		out.println("A runner runs at 14 kilometers in 45 minutes and 30 seconds.");
		double kilo = 14;
		double miles = kilo/1.6;
		double mp45 = (miles*45.5)/14;
		
		
		
		
		
	}

}
