import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //파이프라인
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        // 변수 선언
        int a = sc.nextInt();


    if((a%13 == 0)||(a%19==0)){
        System.out.print("True");
    }
    else{
        System.out.print("False");
    }
    }
}