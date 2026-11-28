import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char k = sc.next().charAt(0);

        if(str.indexOf(k) == -1 ) System.out.print("No");

        else System.out.print(str.indexOf(k));
        // Please write your code here.
    }
}