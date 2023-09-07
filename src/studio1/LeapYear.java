package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year:");
		int y1 = in.nextInt();
//		boolean four = (y1 / 4);
		int year = (y1%400);
		
//int hundred == 0 

System.out.println((y1) + "is a leap year:"); System.out.println((year)==0);

//int hundred *= 0;
	}

}
