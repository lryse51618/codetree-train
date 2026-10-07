import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        //변수 선언
        int A = sc.nextInt(),B = sc.nextInt(),C = sc.nextInt();



        if(B<A && A<C || C<A && A<B){
            System.out.print(A);
        }
        else if(A<B && B<C || C<B && A>B){
            System.out.print(B);
        }
        else if(A<C && C<B || B<C && C<A){
            System.out.print(C);
        }
    }
}