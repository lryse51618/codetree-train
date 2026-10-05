import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        if(k >= 90){
            System.out.print("A");
        }

        else if(k >= 80){
            System.out.print("B");
        }

        else if(k >= 70){
            System.out.print("C");
        }

        else if(k >= 60){
            System.out.print("D");
        }

        else {
            System.out.print("F");
        }
            
        }
        // Please write your code here.
    }
