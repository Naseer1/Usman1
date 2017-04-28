package assignment;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class PerfectSquare {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new
				InputStreamReader(System.in));
				System.out.println("Please enter integer: ");
		int number = Integer.parseInt(reader.readLine());
		int sqrt = (int) Math.sqrt(number);
		if(sqrt*sqrt == number) {
			System.out.println(number+" is a perfact square");
		}
		
		
	}

}
