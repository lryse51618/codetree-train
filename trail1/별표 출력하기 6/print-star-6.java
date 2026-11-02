import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

    //윗몸통
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < i; j ++){

                System.out.print("  ");
            }

            for(int k = 0; k < 2*N-1-2*i; k++){

                System.out.print("* ");
            }

            for(int j = 0 ; j < i; j ++){

                System.out.print("  ");
            }

        System.out.println();

        }

    //아랫몸통
        for(int i = N-2; i>=0   ; i--){

            for(int j = 0 ; j < i; j ++){

                System.out.print("  ");
            }

            for(int k = 0; k < 2*N-1-2*i; k++){

                System.out.print("* ");
            }

            for(int j = 0 ; j < i; j ++){

                System.out.print("  ");
            }
              System.out.println();

        }


    
        // Please write your code here.
    }
}