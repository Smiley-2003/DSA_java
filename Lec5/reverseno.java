package Lec5;

public class reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n = 2347;
        int sum = 0;
        int rev = 0;
        
        while(n % 10 != 0) {
        int  rem = n % 10;
        //sum += rem;//sum = sum + rem;
        n = n / 10;
        rev = rev * 10 + rem; 
        
        }
//        System.out.println(sum);
        System.out.println(rev);
        
	    
	}

}
