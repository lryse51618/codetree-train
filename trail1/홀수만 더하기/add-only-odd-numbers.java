import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    
    //파이프라인
    Scanner sc = new Scanner(System.in);

    //  변수 선언
    int  N = sc.nextInt() , sumVal = 0 ;



    for(int i = 1; i <= N ; i++){
      
      int a = sc.nextInt();
        
        if(a%2 == 1 && a%3 == 0){

            sumVal = sumVal + a ;
        }



    }

        System.out.print(sumVal);




    }
}