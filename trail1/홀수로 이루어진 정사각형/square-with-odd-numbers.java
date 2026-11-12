import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = 11;


        for(int i = 0; i < N; i++){

           
            
            for(int j = 0; j < N; j++){

                
                System.out.print(k+" ");

                k = k + 2;


            }

            k = k - 2*(N-1);

            System.out.println();
        }
        // Please write your code here.
    }
}