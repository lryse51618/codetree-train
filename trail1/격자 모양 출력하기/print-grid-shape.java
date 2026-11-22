import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[11][11];
        int N = sc.nextInt() , M = sc.nextInt();

        for(int i = 0; i < M ; i++){
           int r = sc.nextInt() , c = sc.nextInt();
           arr[r][c] = r * c;
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