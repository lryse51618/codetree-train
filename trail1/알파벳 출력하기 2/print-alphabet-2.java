import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char ch = 'A';


        for(int i = 1; i <= N; i++){

            for(int j = 1; j <= N; j++){
                
                if(i > j){
                    System.out.print("  ");
                    
                }
                
                else if(ch == 'Z'){
                    System.out.print(ch+" ");
                    ch = 'A';
                    
                }

                else{
                    System.out.print(ch+" ");
                    ch++;
                }

            }

            System.out.println();
        }
    }
}