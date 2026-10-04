import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        //파이프라인
        Scanner sc = new Scanner(System.in);


       //값 입력받기

       String str = sc.next();
       String[] dt = str.split("\\.");

       System.out.println(dt[1] + "-" + dt[2] + "-" + dt[0]);
    }
}