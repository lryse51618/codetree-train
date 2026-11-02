import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for(int i = 0 ; i < N; i++){

        for(int k = 0; k <= i; k++){
            System.out.print("*");
            }
           
            System.out.println();
            System.out.println();
        }

        
        
        for(int i = N - 2 ; i >= 0; i--){
           
           for(int k = 0; k <= i; k++){
            System.out.print("*");
            }
             System.out.println();
             System.out.println();

        }
       

        // Please write your code here.
    }
}