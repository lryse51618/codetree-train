import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    
    //파이프라인
    Scanner sc = new Scanner(System.in);

    //  변수 선언
    int A = sc.nextInt() , B = sc.nextInt();
    int sumVal = 0 ;


    for(int i =A; A <= B ; A++){

        sumVal = sumVal + A;



    }

    System.out.print(sumVal);

    
    
    
    }
}