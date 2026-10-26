import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0 ;
        int N = sc.nextInt();


        while(true){
            

            if(N == 1){
                
                System.out.print(i);
                break ;

            }


            else if(N%2 == 0){
               N = N / 2 ;
            }

            else{
                N = N * 3 + 1 ;
            }

            i = i + 1 ;

        }


        
    }
}