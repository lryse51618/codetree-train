import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
    

        for(int i = 0; i < N; i++){

            int cnt = 1;

            if(i % 2 ==0){

                for(int j = 0; j < N; j++){
                    System.out.print(cnt);
                    cnt++;
                }
            }


            else{
                for(int j = 0; j < N; j++){
                    System.out.print(N + 1 - cnt);
                    cnt++;
                }

            }

            System.out.println();
        }
        // Please write your code here.
    }
}