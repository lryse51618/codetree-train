import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //줄 개수 for문
        for(int i = 0 ; i < N ; i++){

            //별 for문
            for(int j = 0 ; j < N - i ; j++ ){
                System.out.print("*");
            }


            //공백 for문
            for(int j = 0; j < 2*i ; j++ ){
                System.out.print(" ");
            }

            //다시 별for문
             for(int j = 0 ; j < N - i ; j++ ){
                System.out.print("*");
            }




        System.out.println();
        }
        // Please write your code here.
    }
}