package day5;

import java.io.*;

public class BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader ir= new InputStreamReader(System.in);
	   java.io.BufferedReader br= new java.io.BufferedReader(ir);
	   int a = Integer.parseInt(br.readLine());
	   String str = br.readLine();
	   System.out.println(a);
	   System.out.println(str);
	   

	}

}
