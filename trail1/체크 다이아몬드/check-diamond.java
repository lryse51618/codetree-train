import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //윗 몸통
        for(int i = 0 ; i < N ; i++){

            //공백
            for(int j = 0; j < N -1-i; j++){
                System.out.print(" ");
            }
            //별
            for(int k = 0; k <= i ; k++){
                System.out.print("* ");
            }
            
            //공백(){}
            for(int j = 0; j < N -1-i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }



        //아랫몸통
        for(int i = N-2 ; i >= 0 ; i--){

            //공백
            for(int j = 0; j < N -1-i; j++){
                System.out.print(" ");
            }
            //별
            for(int k = 0; k <= i ; k++){
                System.out.print("* ");
            }
            
            //공백(){}
            for(int j = 0; j < N -1-i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
        // Please write your code here.
    }
}