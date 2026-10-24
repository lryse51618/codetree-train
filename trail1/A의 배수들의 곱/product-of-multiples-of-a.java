import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt() , prod = 1;

        for(int i = 1; i <= B; i+=1){

            if(i % A == 0){
                prod = prod * i ;
            }


        }
    
            System.out.println(prod);
    
    }
}