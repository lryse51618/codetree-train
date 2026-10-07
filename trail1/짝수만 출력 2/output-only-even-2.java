import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //파이프
        Scanner sc = new Scanner(System.in);

        //변수 선언
        int B = sc.nextInt() , A = sc.nextInt();

        while(B >= A){
            System.out.print(B+" ");
            B -=2 ;

        }
        // Please write your code here.
    }
}