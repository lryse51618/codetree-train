import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char ch = 'A';

        for(int i = 1; i <= N; i++){

            for(int j = 1; j <= i ;j++){

                if(ch != 'Z'){
                   System.out.print(ch);

                   ch++;}

                else if(ch == 'Z'){
                    System.out.print(ch);
                    ch = 'A';
                }


            }

            System.out.println();

        }
        // Please write your code here.
    }
}