import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //파이프라인 만들기
        Scanner sc = new Scanner(System.in);

        // Please write your code here.

        //변수 선언
        int A = sc.nextInt();

        if(A%3 ==0 ){
            System.out.println("YES");

        }

        else{
            System.out.println("NO");

        }

        if(A%5==0){
            System.out.println("YES");

        }

        else{
            System.out.println("NO");

        }
    }
}