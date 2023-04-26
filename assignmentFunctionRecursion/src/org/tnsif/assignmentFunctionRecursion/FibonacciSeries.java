package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

public class FibonacciSeries {

		    public static int fibonacci(int n) {
		        if (n <= 1) {
		            return n;
		        } else {
		            return fibonacci(n-1) + fibonacci(n-2);
		        }
		    }

		    public static void main(String[] args) {
		    	Scanner s =new Scanner(System.in);
		    	
		    	int n =  s.nextInt();
		    	s.close();
		    	
		       // int n = 10; // specify the value of n here
		    	
		        int result = fibonacci(n);
		        System.out.printf("The %dth term in the Fibonacci series is %d", n, result);
		    }
		}


	

