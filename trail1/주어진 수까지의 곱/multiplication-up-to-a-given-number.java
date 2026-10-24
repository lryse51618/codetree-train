import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //변수 선언

        int A = sc.nextInt() , B = sc.nextInt() ;
        int prod = 1 ;
        for(int i = A  ; i <= B ; i++ ){

                prod = prod * i ;


        }


        System.out.println(prod);



        // Please write your code here.
    }
}