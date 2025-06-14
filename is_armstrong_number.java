package Lec7;

import java.util.Scanner;

public class is_armstrong_number {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(is_armstrong_number(n));
	}
	
	
	public static boolean is_armstrong_number(int n) {
		int cod = count_of_digit(n);
		int sum = 0;
		int p = n;
		
		while(n > 0) {
			int rem = n % 10;
			sum = (int)(sum + Math.pow(rem, cod));//rem ^ cod
			n = n / 10;
		}
		
		if(sum == p) {
		    return true;	
		}else {
			return false;
		}		
	}
	
	
	public static int count_of_digit(int n) {
		int c = 0;
		while( n > 0) {
			c++;
			n = n/10;
		}
		return c;
	}
}
