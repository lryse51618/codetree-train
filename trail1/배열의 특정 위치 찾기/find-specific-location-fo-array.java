import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0 , sump = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();

            if(i % 2 == 1)
                sum = sum + arr[i];

            if(i == 2 || i == 5 || i == 8)
                sump = sump + arr[i];
         }

         System.out.printf("%d %.1f" , sum , (double)sump/3);

         
        // Please write your code here.
    }
}