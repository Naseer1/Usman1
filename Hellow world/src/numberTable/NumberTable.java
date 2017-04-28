package numberTable;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		
	//	Scanner sc = new Scanner(System.in);    
	//	int timesTable, counter, total;
	//	System.out.println("what multiplication table would you like to view");
	//	timesTable = scanner.nextint();
	//	System.out.println("To what value would you like to display");
	//	counter = scanner.nextint();
		
	//	for(int i = 0; i <= counter, i++){
	//		total = timesTable * 1;
	//		System.out.println(timesTable + " x " + i + " = " + total);
		int n, c;
		System.out.println("Enter an integer to print its multiplication table");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		System.out.println("Multiplication table of "+n+" is :-");
		for (c = 1 ; c <= 10 ; c++ )
			System.out.println(n+"*"+c+"="+(n*c));
		in.close();
		}
				
	}


