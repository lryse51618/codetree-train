import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //파이프라인
        Scanner sc = new Scanner(System.in);

        //변수 선언

        int A = sc.nextInt();

        System.out.print((A%3==0 || A%5==0) ? "1":"0");

        // Please write your code here.
    }
}