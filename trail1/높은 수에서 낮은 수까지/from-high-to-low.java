import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt() , B = sc.nextInt();
        int i ;


        if(A >= B){
            for(i = A; i>=B; i--){
                System.out.print(i+" ");
            }


        }


        else if(A < B){
            for(i = B; i>=A; i--){
                System.out.print(i+" ");
            }


        }
    }}