import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //변수 선언

        int A = sc.nextInt() , B = sc.nextInt() ;
        int sumVal = 0 , m = 0 ;


        for(int i = A ; i <= B; i++){

            if(i%5==0 || i%7==0){
                sumVal = sumVal + i;
                m = m + 1 ;

            }



        }
        System.out.printf("%d %.1f" ,sumVal , (double)sumVal/m);


        // Please write your code here.
    }
}