package com.assignments;

import java.util.Scanner;

class FibonacciSequense {

	// using recursion

	int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String args[]) {
		FibonacciSequense ob = new FibonacciSequense();
		System.out.println("Enter the number n to print: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println(ob.fibonacci(x));

	}

  //without recursion

  public class FibonacciWithoutRecursion {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int c;
		
		for(int i = 2; i <= n; i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}




}
