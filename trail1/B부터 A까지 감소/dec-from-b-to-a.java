import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        // Please write your code here.

        //변수 선언
        int A = sc.nextInt() , B = sc.nextInt();


        for(int i = B; i >= A; i-- ){
            System.out.print(i+" ");

        }
    }
}