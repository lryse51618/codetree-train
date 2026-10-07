import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //파이프라인
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt() , B = sc.nextInt() , i =1 ;

        while(A <= B){
            System.out.print(A+" ");
            A = A+2;
        }
        // Please write your code here.
    }
}