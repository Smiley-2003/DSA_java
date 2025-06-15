import java.util.*;
public class Main {

    public static int gcd(int a,int b){
        while(b != 0){
            int temp  = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(int a,int b){
        
        return (long) a * (b / gcd(a,b));
    }

    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);

     int n1 = sc.nextInt();
     int n2 = sc.nextInt();

     System.out.println(lcm(n1, n2));
    }
}
