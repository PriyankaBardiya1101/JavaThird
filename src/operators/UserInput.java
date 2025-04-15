package operators;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int n=sc.nextInt();
		
		System.out.println("Enter second number");
		int m=sc.nextInt();
		
		
		int sum=n+m;
		System.out.println(sum);
		
		System.out.println(n-m);
		
		System.out.println(n*m);
		
		System.out.println(n/m);
		System.out.println(n%m);


	}

}
