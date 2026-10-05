import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //파이프라인
        Scanner sc = new Scanner(System.in);

       double a = sc.nextDouble() ;


        if (a>=1.0) {

            System.out.print("High");

        }
        else if (a >= 0.5 ){

            System.out.print("Middle");
        }
        else {
            
            System.out.print("Low");}
        // Please write your code here.
    }
}

