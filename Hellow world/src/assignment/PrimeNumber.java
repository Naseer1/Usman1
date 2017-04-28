package assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int my_int = sc.nextInt();
		if(my_int > 0 )
		{
			//verify if it should not be divisible by any other number other than 1 and itself
			
			int flag = 0;
			//verify if divisible by 1
			if(my_int%1 == 0)
			{
				System.out.println("number divisible by 1");
			}
			else
			{
				System.out.println("number is not divisible by 1");
				flag = 1;
			}
			if(my_int%my_int == 0)
			{
				System.out.println("number divisible by "+my_int);
			}
			else
			{
				System.out.println("number is not divisible by "+my_int);
				flag = 1;
			}
			for (int i = 2; i <=my_int-1;i++)
			{
				if (my_int%i==0)
				{
				System.out.println("number divisible by "+i+", hence it is not prime number");
				flag = 1;
				break;
				}
			}
			if (flag == 1)
			{
				System.out.println(my_int + "is not a prime number");
			}
			else
			{
				System.out.println(my_int+"is a prime number");
			}
			//verify if divisible by my_int
			
		}
		else
		{
			System.out.println("number is not positive integer");
		}
		

	}

}
