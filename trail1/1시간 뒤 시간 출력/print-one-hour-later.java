import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        //파이프라인 설치
        Scanner sc = new Scanner(System.in);

        //입력 예: "10:20"
        String time = sc.next();

        //":" 를 기준으로 분리
        String[] strArr = time.split(":");

        //Integer.parseInt("10")은 글자 "10"을 숫자 10으로 바꿔줘.
        int h , m ;

        h = Integer.parseInt(strArr[0]);
        m = Integer.parseInt(strArr[1]);

        //1시간 뒤의 시간 계산 

        h = h + 1 ;

        System.out.println(h+":"+m);

     
    }

}