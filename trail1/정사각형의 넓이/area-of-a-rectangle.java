import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //파이프라인 만들기
        Scanner sc = new Scanner(System.in);

        //변수 선언
        Double N = sc.nextDouble();

        System.out.println((int)(N*N));

        if (N<5) {

            System.out.println("tiny");

        }



        // Please write your code here.
    }
}