import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //파이프라인 만들기
        Scanner sc = new Scanner(System.in);

        //문자열 받기
        String date = sc.next();

        
        //받은 문자열을 배열에 나누어 담기
        String[] dateArr = date.split("-") ;


        System.out.println(dateArr[2]+"."+dateArr[0]+"."+dateArr[1]) ;



        // Please write your code here.
    }
}