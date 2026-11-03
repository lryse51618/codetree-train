import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    //윗몸통
    for(int i = 0; i < n ; i++){

        if(i % 2 == 0 ){
            for(int j = 0 ; j < n-i/2; j++){
                System.out.print("* ");
            }
        }

        
        
        else{
            for(int k = 0 ; k < (i+1)/2; k++){

                    System.out.print("* ");
            }
            
        }

        System.out.println();
    }


    //아랫몸통
    for(int i = n-1 ; i >= 0; i--){


        if(i % 2 == 0 ){
            for(int j = 0 ; j < n -i/2; j++){
                System.out.print("* ");
            }
        }

        
        
        else{
            for(int k = 0 ; k < (i+1)/2; k++){

                    System.out.print("* ");
            }
            
        }

        System.out.println();




    }
    }
}