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
		
		int sum = num1 + num2 + num3;
		int average = sum / 3;
		int product = num1 * num2 * num3;
		
		int smallest = 0;
		int largest = 0;
		
		if(num1 > num2){
		    smallest = num2;
		    largest = num1;
		} else if(num1 < num2){
		    smallest = num1;
		    largest = num2;
		} else if(smallest > num3){
		    smallest = num3;
		    largest = smallest;
		} else {
		    smallest = smallest;
		    largest = num3;
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Product: " + product);
		System.out.println("Smallest: " + smallest);
		System.out.println("Largest: " + largest);
	}
}//if(smallest > num3){
