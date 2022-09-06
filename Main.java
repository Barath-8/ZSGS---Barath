import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To find odd or even
		int a =31;
		/*
		if((a&1)==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		*/
		String isOdd = ((a|0)==0)?
									"EVen": "Odd";
		System.out.println(isOdd);
		        
		//Swap two numbers
		int b = 23;
			
			a=a^b;
			b=b^a;
			a=a^b;
			
		System.out.println(a +" "+b);
		
		//To find unique element
		
		int arr[] = {1,2,3,4,5,1,2,3,4};
		
		int uniq =0;
		
		for(int n : arr)
			uniq ^=n;
		
		System.out.println(uniq);
	
		
		//To find Duplicates
		
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1; j<arr.length ;j++) {
				if((arr[i]^arr[j]) == 0)
					System.out.println(arr[i]);
			}
		}
		

	}

}
