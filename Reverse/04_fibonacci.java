import java.util.Scanner;

public class Main{

     public static long  fibonacci (int n){
       if(n==0)return 0;
       if(n==1)return 1;

       long a = 0;
       long b = 1;
       long c = 0;

       for(int i = 2; i <= n;i++){
         c = a + b;
         a = b;
         b = c;
       }
       return c;
}

public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println(fibonacci(n));
}
}
