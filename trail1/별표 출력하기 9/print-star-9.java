import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){

            //공백 for문
            for(int j = 0; j < i*(-1)+(N-1); j++){
                
                System.out.print("  ");

            }
            
            
            //별 for문
            for(int j = 0; j < i*2+1; j++){

                System.out.print("* ");


            }

            System.out.println();
        }
        // Please write your code here.
    }
}