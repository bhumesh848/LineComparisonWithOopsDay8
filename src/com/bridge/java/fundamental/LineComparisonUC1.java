package com.bridge.java.fundamental;

import java.util.Scanner;

public class LineComparisonUC1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2;
		/* Initialized all variables to 0 */
		//x1 = x2 = y1 = y2 = 0;
		System.out.println("Enter x1 coordinate point & y1");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("Enter x2 coordinate point & y2");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		System.out.println("x1->"+ x1 + ", y1->" + y1 + ", x2->" + x2 +", y2->" + y2);
		double lengthOfLine = Math.sqrt((x2 - x1) ^ 2 + (y2- y1) ^ 2);
		System.out.println("Length of line is :" + lengthOfLine );
	}

}
