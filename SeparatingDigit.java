import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int x = 10000;
	    int newNum = 0;
	    
		System.out.print("Enter a five digit number: ");
		int num = sc.nextInt();
		
		if(num > 99999 || num <10000){
		    System.out.println("That is not a five digit number!");
		} else{
		    newNum = num % x;
		    num = num / x;
		    x = x / 10;
		    System.out.print(num + " ");
		    
		    num = newNum / x;
		    newNum = newNum % x;
		    x = x / 10;
		    System.out.print(num + " ");
		    
		    num = newNum / x;
		    newNum = newNum % x;
		    x = x / 10;
		    System.out.print(num + " ");
		    
		    num = newNum / x;
		    newNum = newNum % x;
		    x = x / 10;
		    System.out.print(num + " ");
		    
		    System.out.println(newNum);
		}
	}
}
