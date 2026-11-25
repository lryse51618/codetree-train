import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String f = "" ;

        for(int i = 0; i < n; i++){
            String str = sc.next();

            f = f + str;
        }
        System.out.print(f);

        // Please write your code here.
    }
}