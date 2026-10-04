import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //파이프라인
        Scanner sc = new Scanner(System.in);

        //값을 받을 박스 만들기

        String str = sc.next();
        String[] pb = str.split("-");

        System.out.println(pb[0] + "-" + pb[2] + "-" + pb[1]);
        // Please write your code here.
    }
}