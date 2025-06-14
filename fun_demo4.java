package Lec7;

public class fun_demo4 {

	
	static int val = 100;//global variable
	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
//			 System.out.println("hey");
	         int a = 89;
	         int b = 7;
	         System.out.println(a);
	         System.out.println(val);
	         System.out.println(addition(b,a));
	         System.out.println(val);
	         System.out.println("Bye");
		}
	
	   public static int addition(int a,int b) {
			
			int c = a + b;
			//local variable
			int val = 89;
			val = val - 5;
			fun_demo4.val = fun_demo4.val - 5;
			return c + sub(c,a);
			
		}
		
		public static int sub(int a,int b ) {
			
			int c = a - b;
			return c;
			
	}
}


