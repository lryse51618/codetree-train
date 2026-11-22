import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;
       
       for(int i = 0; i < 3; i++){

        int len = sc.next().length();

        if(len < min) min = len;
        if(len > max) max = len;

       }
       System.out.print(max - min);
        // Please write your code here.
    }
}