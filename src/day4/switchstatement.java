package day4;

import java.util.Scanner;

public class switchstatement {

	private static Scanner s;
public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 for (int i=1;i<=10;i++)		
		{
			System.out.println("Enter your course");
		String course=s.next();
		switch(course.toUpperCase())
		{
	
		case "SELINIUM":
		System.out.println("course is present "+course);
		break;
	case "JAVA":
	System.out.println("course is present "+course);
	break;
		case "MANUAL TESTING":
			System.out.println("course is present "+course);
			break;
		case "QTP":
			System.out.println("course is present "+course);
			break;
			default:
				System.out.println("course is not present ");
				break;
			
		}
		}
	}
}
		
