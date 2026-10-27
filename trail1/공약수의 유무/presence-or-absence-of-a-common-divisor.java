import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt() , B = sc.nextInt() ;
        boolean flag = false ;


        for(int i = A; i <= B ; i ++ ){

            if(1920%i==0 && 2880%i==0)
                flag = true ;

        }

         if(flag == true)
            System.out.print(1);

            else
            System.out.print(0);


      
    }
}