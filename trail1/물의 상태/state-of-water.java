import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        //파이프라인
        Scanner sc = new Scanner(System.in);

        //변수 선언
        int n = sc.nextInt();

        if(n < 0 ){
            System.out.print("ice");
        }
        else if(n >= 100 ){
            System.out.print("vapor");

        }
        else {System.out.print("water");
        
        }




    }

}