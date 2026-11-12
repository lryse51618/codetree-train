import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        


        for(int i = 0; i < N; i++){

           
            
            for(int j = 0; j < N; j++){

                
                System.out.print((i*2+j*2+11)+" ");

                


            }


            System.out.println();
        }
        // Please write your code here.
    }
}