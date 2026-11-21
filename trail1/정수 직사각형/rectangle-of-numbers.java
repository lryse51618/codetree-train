import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.]
        
        int N = sc.nextInt() , M = sc.nextInt();
        int[][] arr2d = new int[N][M];

        int c = 1;

        
        for(int i = 0; i < N; i++){

            for(int j = 0; j < M; j++){

                arr2d[i][j] = arr2d[i][j] + c;

                System.out.print(arr2d[i][j]+" ");


                    c++;

            }
            System.out.println();
        }
    }
}