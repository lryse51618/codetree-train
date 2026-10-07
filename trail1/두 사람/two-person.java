import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        //파이프라인 설정
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() ;
        String as =sc.next() ;
        int b = sc.nextInt() ; 
        String bs = sc.next();


     if(a >= 19 && as.equals("M")  ||  b >= 19 && bs.equals("M") ){
        
        System.out.print("1");

     }
     
     else{
        
        System.out.print("0");

     }

    }
}