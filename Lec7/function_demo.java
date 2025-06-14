package Lec7;
//not outside this main class
public class function_demo {
//private public both are   access modifier
	
//	private-> access modifier 
//  public ->access modifier
	
	//inside  this class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("hey");//hey
        int a = 89;
        System.out.println(a);//89
        addition();//16
        System.out.println("bye");//bye
        
	}
	
	//function are of two types --> parameterized and non-parameterized 
	
	//non parameterized function
//	public static static addition()
	public static void addition() {
		
		int a = 9;
		int b = 7;
		int c = a + b;
		sub();//2
		System.out.println(c);
//		return c;
		
	}
	
	public static void sub() {
		
		int a = 9;
		int b = 7;
		int c = a - b;
		System.out.println(c);
		
	}
}
