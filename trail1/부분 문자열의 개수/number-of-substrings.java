import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int cnt = 0;

        int length = A.length();


        for(int i = 0; i < length - 1 ; i++){

            for(int j = 0; j < 1; j++){
               if( A.charAt(i) == B.charAt(j) &&  A.charAt(i+1) == B.charAt(j+1))
               cnt++;


            }
        }

        System.out.print(cnt);
        // Please write your code here.
    }
}