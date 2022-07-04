package day4;

public class Swaping_Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		System.out.println("Before swapping A value is: "+a);
		System.out.println("Before swapping B value is: "+b);
		
		a=a+b-(b=a); //Swapping Logic //a=25-(b=10) a=15
		System.out.println("After swapping A value is: "+a);
		System.out.println("After swapping B value is: "+b);

	}

}
