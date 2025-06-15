import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int position = 1;
        int oddSum = 0;
        int evenSum = 0;


        while(n > 0){
            
            int digit = n % 10;

           if(position % 2 == 1){
               oddSum += digit;
           }else{
               evenSum += digit;
           }
           position++;
           n = n/ 10;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
