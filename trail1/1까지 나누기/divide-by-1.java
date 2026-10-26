import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for(int i = 1 ;   ; i ++){

            N = N / i ;
                if(N <= 1){
                    System.out.print(i);
                    break;
                }


        }


        // Please write your code here.
    }
}