import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(num > 0){
		    System.out.println("You entered a positive number!");
		}else if(num < 0){
		    System.out.println("You entered a negative number!");
		}else{
		    System.out.println("You entered zero.");
		}
	}
}
