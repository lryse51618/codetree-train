import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt() , B = sc.nextInt();

        for(int i = 1; i <= 4 ; i++){

            for(int j = B; j >= A; j--){

                System.out.print(j +" * "+ (2*i) + " = " + j*2*i);

                if(j>A){
                    System.out.print(" / ");
                }

            }
            System.out.println();
        }
        // Please write your code here.
    }
}