import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        int[][] arr2d = new int[10][10];

       

            for(int j = 0; j < M; j++){

                int r = sc.nextInt(), c = sc.nextInt();

                arr2d[r][c] = 1;


            }
        

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                System.out.print(arr2d[i][j]+" ");
            }

            System.out.println();
        }
        // Please write your code here.
    }
}