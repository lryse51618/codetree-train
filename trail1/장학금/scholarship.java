import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //파이프라인

    Scanner sc = new Scanner(System.in);

        // 변수 선언
        int J = sc.nextInt() , K = sc.nextInt() ; 
        

        if (J >= 90 && K>=95 ){
            System.out.print("100000");

    

        }
        else if (J >= 90 && K >= 90){
            System.out.print("50000");

        }

        else {
            System.out.print("0");
        }
    }
}