import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int[100][100] ;

        int N = sc.nextInt() , M = sc.nextInt();

        int cnt = 0;

        for(int j = 0; j < M; j++){

            
            if(j % 2 == 0){
                 for(int i = 0; i < N; i++){
                    arr2d[i][j] = cnt;
                    cnt++;

                    }
            }

            else{
                for(int i = N-1; i >= 0; i--){
                arr2d[i][j] = cnt;
                cnt++;
                }
            }
       }



        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){

                System.out.print(arr2d[i][j]+" ");
            }

            System.out.println();
        }

        // Please write your code here.
    }
}