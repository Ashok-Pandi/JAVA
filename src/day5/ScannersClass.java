/*
By Using Scanner class do the below operations
1. Adding two Numbers
2. Multiply two numbers
3. Divide two numbers

*/
package day5;

import java.util.Scanner;

public class ScannersClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner io = new Scanner(System.in);
	
	//	String name = io.next();
		int a = io.nextInt();
		int b = io.nextInt();
	//	int c= io.nextInt();
		//Float f  = io.nextFloat();
		//Double d = io.nextDouble();
	//System.out.println(name);
	int 	c=a+b;
	int c1= a*b;
	int c2=a/b;
	System.out.println(c1);
	System.out.println(c);
	System.out.println(c2);
	}

}
