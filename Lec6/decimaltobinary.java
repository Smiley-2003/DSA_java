package Lec6;

public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n = 39;
           int sum = 0;
           int mul = 1;//10 ^ 0
           
           while(n > 0) {
        	   int rem = n % 2;
        	   sum = sum + rem * mul;
        	   mul = mul * 10;
        	   n = n/2;
           }
           System.out.println(sum);
           
           
	}

}
