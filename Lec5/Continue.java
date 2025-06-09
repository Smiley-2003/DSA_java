package Lec5;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 7;
        int fact = 0;
        for(int i = 1; i<= n; i++) {
         	if(i==3) {
        		continue;
//         		break;
        	}
        	System.out.println(i);
        
        }
////        	System.out.println(i);
//        	if(n % i == 0) {
//        		fact++;
//        		continue;
//        	}
       
//        if(fact==1) {
//        	System.out.println("Not Prime");
//        }else {
//        	System.out.println("Prime");
//        }
         
	}

}
