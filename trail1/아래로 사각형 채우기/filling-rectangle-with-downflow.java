import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] arr2d = new int[N+1][N+1];
        int k ;

        for(int i = 1; i <= N ; i++){


   k = i;
            for(int j = 1; j <= N; j++){

                    
                arr2d[i][j] = k;

                System.out.print(k +" ");

                k = k + N;
            }

            System.out.println();
        }
        // Please write your code here.
    }
}