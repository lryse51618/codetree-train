import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr2d = new int[10][10];
        int N = sc.nextInt();

        //1로 세팅
        for(int i = 0; i < N; i++){
            arr2d[i][0] = 1;
            arr2d[0][i] = 1;
        }

        for(int i = 1; i < N; i++){

            for(int j = 1; j < N; j++){

                arr2d[i][j] = arr2d[i-1][j]+arr2d[i][j-1]+arr2d[i-1][j-1];
            }
        }

         for(int i = 0; i < N; i++){

            for(int j = 0; j < N; j++)  {System.out.print(arr2d[i][j]+" ");}

            System.out.println();
        // Please write your code here.
    }
}
}