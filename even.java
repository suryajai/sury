package odd;

import java.io.*;

public class evenodd
 {
	public static void main(String args[])
	{int no;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter any number");
	no=in.nextInt();
	if(no%2==0){
		System.out.println("The given no is even");
	}if(no%2!=0){
		System.out.println("The given no is odd");
	}
	}





