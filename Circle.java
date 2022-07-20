import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    double pi = 2.1416;
	    
		System.out.print("Radius: ");
		int radius = sc.nextInt();
		
		int diameter = 2 * radius;
		double circumference = 2 * pi * radius;
		double area = pi * radius * radius;
		
		System.out.println("Diameter: " + diameter);
		System.out.println("Circumference: " + circumference);
		System.out.println("Area: " + area);
	}
}
