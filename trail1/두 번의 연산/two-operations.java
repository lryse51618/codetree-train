import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //파이프라인 
        Scanner sc = new Scanner(System.in);

        //변수선언
        int a = sc.nextInt();

        if(a%2 != 0){ 
            a = a+3 ;
        } 

        if(a%3==0){
            a = a/3 ;
        }
      System.out.println(a);



        // Please write your code here.
    }
}