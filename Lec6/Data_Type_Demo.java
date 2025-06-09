package Lec6;

import java.util.Scanner;

public class Data_Type_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		byte b = (byte)(428);//-84
		byte b = (byte)(300);//44//explicit type casting//kukure->cukure
		byte b1 = 10;//implicit type casting
		short s = 10;
		int i = 10;
		//typecasting literal type changes to long by applying l
		//literal 9 digit range or limit if 10 digit limit exceed
		long l = 456789089l;// Brand change Britania -> parle G
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		//typecasting
		b = (byte)(i);
		i = b;
		
		Scanner sc = new Scanner(System.in);
		b = sc.nextByte();
		s = sc.nextShort();
		i = sc.nextInt();
//		f = sc.nextFloat();
		
		//int a = 032;
		//System.out.println(a);
		
		

	}

}
