import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt() , M = sc.nextInt() , k = 1;

        int[][] arr = new int[10][10];

        
            for(int i = 0; i < M; i++){

               int r = sc.nextInt() , c = sc.nextInt();
                arr[r][c] = k;
                k++;

            }

            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= N; j++){

                        System.out.print(arr[i][j]+" ");
                }

                System.out.println();
            }


        // Please write your code here.
    }
}