package com.bridge.java.fundamental;

import java.util.Scanner;

public class LineComparisonUC3 {
	public static void main(String[] args) {
		double lengthOfLine1 = getLengthOfLine();
		System.out.println("Length of line 1 is :" + lengthOfLine1);

		double lengthOfLine2 = getLengthOfLine();
		System.out.println("Length of line 2  is :" + lengthOfLine2);
		int result = Double.compare(lengthOfLine1, lengthOfLine2);
		if (result == 0) {
			System.out.println("Two lines are equal");
		} else if (result < 0) {
			System.out.println("line 1 is smaller than line 20");

		} else {
			System.out.println("line 1 is greater than line 2");
		}

	}

	private static double getLengthOfLine() {
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2;
		/* Initialized all variables to 0 */
		// x1 = x2 = y1 = y2 = 0;
		System.out.println("Enter x1 coordinate point & y1");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("Enter x2 coordinate point & y2");
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		System.out.println("x1->" + x1 + ", y1->" + y1 + ", x2->" + x2 + ", y2->" + y2);
		double lengthOfLine = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		return lengthOfLine;

	}

}
