import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter the third number: ");
		int num3 = sc.nextInt();
		
		System.out.print("Enter the forth number: ");
		int num4 = sc.nextInt();
		
		System.out.print("Enter the fifth number: ");
		int num5 = sc.nextInt();
		
		int smallest = 0;
		int largest = 0;
		
		if(num1 > num2 || num1 == num2){
		    smallest = num2;
		    largest = num1;
		}
		if(num1 < num2){
		    smallest = num1;
		    largest = num2;		    
		}
		if(smallest < num3 || largest > num3){
		    smallest = smallest;
		    largest = largest;
		}
		if(smallest > num3){
		    smallest = num3;
		    largest = largest;
		}
		if(largest < num3){
		    smallest = smallest;
		    largest = num3;
		}
		if(smallest < num4 || largest > num4){
		    smallest = smallest;
		    largest = largest;
		}
		if(smallest > num4){
		    smallest = num4;
		    largest = largest;
		}
		if(largest < num4){
		    smallest = smallest;
		    largest = num4;
		}
		if(smallest < num5 || largest > num5){
		    smallest = smallest;
		    largest = largest;
		}
		if(smallest > num5){
		    smallest = num5;
		    largest = largest;
		}
		if(largest < num5) {
		    smallest = smallest;
		    largest = num5;
		}
		
		System.out.println("Smallest: " + smallest);
		System.out.println("Largest: " + largest);
	}
}
