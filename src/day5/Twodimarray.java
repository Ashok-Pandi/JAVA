package day5;

public class Twodimarray {
	public static void main(String[] args) {
		// Storing data in  two dimensional array
 String login[][]=new String[4][2];
 //first row first column
 login[0][0]="Admin1";
 //1st row 2nd column
 login[0][1]="test1";
 //2nd row 1st column
 login[1][0]="Admin2";
 //2nd row 2nd column
 login[1][1]="test2";
 //3rd row 1st column
 login[2][0]="Admin3";
 //3rd row 2nd column
 login[2][1]="test3";
 //4th row 1st column
 login[3][0]="Admin4";
 //4th row 2nd column
 login[3][1]="test4";
 {
 System.out.println("Row size  "+login.length);
 System.out.println("Column size  "+login[3].length);
 System.out.println(login[2][1]);
 System.out.println("==================================");
 }
 // to print all rows
 for (int i=0;i<login.length;i++)
 {
	 // to print all columns in each row
	 for (int j=0;j<login[i].length;j++)
	 {
		 
	 System.out.print(login[i][j]+"\t");
	 
	 }
	 System.out.println();
 
	}
	}
}
