import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N*2+1; i++){

            for(int j = 0; j < N*2+1; j++){


                if(i%2==0 || j%2==0){
                    System.out.print("* ");
                }



                else{
                    System.out.print("  ");

                }
            


            }
            System.out.println();



        }
    }
}