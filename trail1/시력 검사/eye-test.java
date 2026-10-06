import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double L = sc.nextDouble() , R = sc.nextDouble() ;

        if (L>=1.0 && R>=1.0){

System.out.println("High");

        }

    else if(L>=0.5 && R>=0.5){
        System.out.println("Middle");

    }
    else{
        System.out.println("Low");

    }



    }
}