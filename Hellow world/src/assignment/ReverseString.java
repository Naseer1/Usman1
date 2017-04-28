package assignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String input,reverse="";
		System.out.println("Enter the input String");
		Scanner scanner = new Scanner(System.in);
		input=scanner.nextLine();
		System.out.println("Revers String");
		for (int i=input.length()-1; i>= 0;i--){
		reverse=reverse+input.charAt(i);
		}
		System.out.println("Revers string="+reverse);

	}

}


