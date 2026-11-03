import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0 ; i < N; i++){

            if(i % 2 == 1){
                for(int j = 0; j < i + 1; j++ ){
                     System.out.print("* ");
                }
               
            }

            else{
                System.out.print("*");
            }

            System.out.println();

        }
        // Please write your code here.
    }
}