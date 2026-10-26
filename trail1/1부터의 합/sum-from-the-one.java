import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0 ;
        int i ;


        for(i = 1 ; i <= 100 ; i++){

            sum = sum + i ;

            if(sum >= N){
                break ;
            }

        }
        System.out.print(i);
        // Please write your code here.
    }
}