import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Please write your code here.
        //파이프라인
    Scanner sc = new Scanner(System.in);


    //  변수 선언
    int A = sc.nextInt() , B = sc.nextInt();




    while( A<=B ){
        
        
        if( A%2==0 ){
           
            System.out.print(A+" ");
             A = A + 3;
        }


        else{
            
            System.out.print(A+" ");
            A = A * 2 ;

        }






    }




    }
}