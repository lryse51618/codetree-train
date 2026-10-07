import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        //pipe
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt() , N = sc.nextInt() ;
        int i = 1 ;
        

        while(i <= N){
            System.out.println(A+N);
            i+=1;
            A = A+N;

        }
    }
}