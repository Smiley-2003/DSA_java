package Lec6;

public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 100111;
         int sum = 0;
         int mul = 1;//2 ^ 0
         
         while(n > 0) {
      	   int rem = n % 2;
      	   sum = sum + rem * mul;
      	   mul = mul * 2;
      	   n = n/10;
         }
         System.out.println(sum);
	}

}
