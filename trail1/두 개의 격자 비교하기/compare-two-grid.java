import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() , M = sc.nextInt();

        int[][] arr2d = new int[N][M];

        int[][] arrkk = new int[N][M];



        for(int i = 0; i < N; i++){

            for(int j = 0; j < M; j++)
             arr2d[i][j] = sc.nextInt();
        }


        for(int i = 0; i < N; i++){

            for(int j = 0; j < M; j++)
            arrkk[i][j] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
           for( int j = 0; j < M; j++){

                if(arr2d[i][j] == arrkk[i][j]){
                    System.out.print(0+" ");
                }

                else{ System.out.print(1+" ");}

           }
           System.out.println();

        }




        // Please write your code here.
    }
}