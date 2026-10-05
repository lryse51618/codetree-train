import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a = sc.nextInt() , b = sc.nextInt() ;

        if(a>b) {
            System.out.print(a*b);
        }
        else{
            System.out.print(b/a);
        }
    }
}