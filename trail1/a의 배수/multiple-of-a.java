import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

         //파이프라인
    Scanner sc = new Scanner(System.in);


//  변수 선언
    int N = sc.nextInt() , a = sc.nextInt() , i = 1;


    while( i<=N ){ 
        if(i%a == 0){
            System.out.println(1);

        }
        else{
            System.out.println(0);
        }

i = i + 1;


    }

    }
}