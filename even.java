package odd;

import java.util.Scanner;

public class evenodd
 {
	public static void main(String args[])
	{int a;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=in.nextInt();
	if(a%2==0){
		System.out.println("The given no is even");
	}if(a%2!=0){
		System.out.println("The given no is odd");
	}
	}





