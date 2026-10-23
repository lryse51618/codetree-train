import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt() , B = sc.nextInt();
        int k = 0;



        if(A <= B){ 
            
            for(int i = A; i <= B; i++ ){

                if(i % 5 == 0){
                    k = k + i ;
                 }
                }
        }

        else{

            for(int i = B; i <= A; i++){
                
                if(i % 5 == 0){
                    k = k + i;
                }
            }



        }
System.out.println(k);

        }
        



        // Please write your code here.
        //
    }
