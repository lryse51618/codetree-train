import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        //문자열 입력

        String s = sc.next();

        //입력 받은 문자열의 첫 번째 문자 추출
        char c = s.charAt(0);


        System.out.println(c);
    }
}