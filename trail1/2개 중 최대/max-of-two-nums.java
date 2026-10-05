import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //변수 선언
        int A = sc.nextInt() , B = sc.nextInt();

        //
        if(A > B) {
            System.out.print(A);
        }
        else {
            System.out.print(B);
        }
        // Please write your code here.
    }
}