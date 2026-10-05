import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //파이프라인
        Scanner sc = new Scanner(System.in);

        //변수 선언
        double h , w ,b;
        h = sc.nextDouble() ;
        w = sc.nextDouble() ;

        b = (10000 * w)/(h*h) ;



        System.out.println((int)b) ;



        if(b >= 25)   {
        System.out.println("Obesity");

        }



    }
}