import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        String str = sc.next();


        for(int i = str.length() - 1; i >=0 ; i--){

            //짝수번째
            if(i % 2 == 1) System.out.print(str.charAt(i));

            //홀수번째
            else{ continue;}

        }
    }
}