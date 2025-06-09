package Lec6;

public class sourcetodesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 110001;
        int sum = 0;
        int mul = 1;//2 ^ 0
        
        //decimal to binary
        int dest_base = 2;
        int src_base = 2;
        
        while(n > 0) {
     	   int rem = n % dest_base;
     	   sum = sum + rem * mul ;
     	   mul = mul * src_base;
     	   n = n/10;
        }
        System.out.println(sum);
	}


}
  