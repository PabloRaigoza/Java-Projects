/* This is the second Java program I have written
 * The first was a simple HelloWorld project.
 * The main goal of this projects is to become familiar with the syntax of Java a bit
 */

import java.util.Scanner;

class Calculator{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		int userNum1;
		int userNum2;
		int op;
		int total;
		
		System.out.print("Enter first num: ");
		userNum1 = input.nextInt();
		
		System.out.print("Enter second num: ");
		userNum2 = input.nextInt();
		
		System.out.println("1 = Add | 2 = Sub | 3 = Multi | 4 = Div");
		System.out.print("Enter op: ");
		op = input.nextInt();

		switch( op )
		{
			case 1:
				total = userNum1 + userNum2;
				break;
			case 2:
				total = userNum1 - userNum2;
				break;
			case 3:
				total = userNum1 * userNum2;
				break;
			case 4:
				total = userNum1 / userNum2;
				break;
			default:
				total = 0;
				System.out.println("Wrong response!");
				break;
		}
	
		System.out.println( "Total is: " + total );
	}
}
