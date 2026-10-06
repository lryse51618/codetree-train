import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //파이프라인
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a%2 == 0){
            a = a/2 ;
        }

        if(a%2 != 0){
           a = (a+1)/2 ;
        }



        System.out.println(a) ;

    
        // Please write your code here.
    }
}