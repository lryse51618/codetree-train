import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String k = sc.next();


        if(k.equals("S")){
            System.out.print("Superior");
        }

        else if(k.equals("A")){
            System.out.print("Excellent");
        }

        else if(k.equals("B")){
            System.out.print("Good");
        }

        else if(k.equals("C")){
            System.out.print("Usually");
        }

        else if(k.equals("D")){
            System.out.print("Effort");
        }

        else {
            System.out.print("Failure");
        }
        // Please write your code here.
    }
}