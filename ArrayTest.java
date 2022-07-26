import java.util.Arrays;
public class ArrayTest{
	public static void main(String[] args){
		int[] a = {5, 8, 2, 10, 13, 7, 4, 1};
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(a));
		int p = a[0];
		int temp = 0;
		
		//getting the position of pivot. start
		for(int x = 1; x < a.length; x++){
			for(int y = 1; y < a.length; y++){
				if(p  > a[y]){
					temp = a[y];
					a[y] = a[y-1];
					a[y-1] = temp;
				}
			}
		} //getting teh position of pivot. end
		
		//getting the index of pivot. start
		int ind=0;
		for(int b = 0; b < a.length; b++){
			if(a[b] == p){
				ind = b;
				break;
			}
		}
		int c=a[ind];
		//getting the index of pivot. end
		
		
		int pivx;
		for(int b = 1; b <= ind; b++){
			pivx = a[0];
			
		}
		
		
		System.out.println("Inded: " + ind);
		System.out.println("Value: " + c);
		
		for(int z = 0; z < a.length; z++){
			System.out.print(a[z]+ " ");
		}
	}
}