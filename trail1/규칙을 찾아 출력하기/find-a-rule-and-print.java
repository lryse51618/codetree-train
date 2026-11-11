import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        //몇줄 그릴지
       for(int i = 0; i < N; i++){

            for(int j = 0; j < N; j++){

                //ㄱ자 모양
                if(i == 0 || j == N-1){

                    System.out.print("* ");

                }

                //ㄱ자 모양 제외한 나머지들 중에서...
                else {
                    if(i > j){
                        System.out.print("* ");
                    }

                    else{
                        System.out.print("  ");
                    }
                }


            }
            System.out.println();

        }
        // Please write your code here.
    }
}