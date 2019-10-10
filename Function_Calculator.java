package com.basic;

import java.util.Scanner;

public class Function_Calculator {

	public static void main(String[] args) {
		int c=1;
		do
		{
		int num1,num2,num3;
		num1=num2=num3=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter 1 for add 2 for subtraction 3 for multiplication and 4 for division");
		num3=sc.nextInt();
		switch(num3) {
		 
		case 1:
			System.out.println("\nEnter Num1");
			num1=sc.nextInt();
			
			System.out.println("\nEnter Num2");
			num2=sc.nextInt();
			System.out.println("Sum of two nos="+add(num1,num2));break;
		case 2:
			System.out.println("\nEnter Num1");
			num1=sc.nextInt();
			
			System.out.println("\nEnter Num2");
			num2=sc.nextInt();
			System.out.println("diffrence of two nos="+sub(num1,num2)); break;
		case 3:
			System.out.println("\nEnter Num1");
			num1=sc.nextInt();
			
			System.out.println("\nEnter Num2");
			num2=sc.nextInt();
			System.out.println("Multiplication of two nos="+mult(num1,num2)); break;
		case 4:
			System.out.println("\nEnter Num1");
			num1=sc.nextInt();
			
			System.out.println("\nEnter Num2");
			num2=sc.nextInt();
			System.out.println("division of two nos="+div(num1,num2)); break;
		default:
			System.out.println("wrong choice");
		}
		System.out.println("Do you wish to continue..enter 1 for yes and 0 for no");
		c=sc.nextInt();
		sc.close();
		}
		while(c==1);
	}
	
	static int add(int no1,int no2)
	{
		return no1+no2;
	}
    
	static int sub(int no1,int no2)
	{
		return no1-no2;
	}
	
	static int mult(int no1,int no2)
	{
		return no1*no2;
	}
	
	static int div(int no1,int no2)
	{
		return no1/no2;
	}
}
