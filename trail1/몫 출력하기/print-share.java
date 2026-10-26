import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int k = 0;

        for(int i = 1 ;  ; i++){
           int N = sc.nextInt();

            if(N%2 == 1){
                continue;
            }
            else if(N%2 == 0){
                System.out.println(N/2);
                k ++;
            }

            if(k == 3)
            break;


        }


        
    }
}