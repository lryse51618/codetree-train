import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int N = sc.nextInt();
        int cnt = 0;

        arr[0] = 1;
        arr[1] = N;

        
        for(int i = 2; i < 100 ; i++){

            arr[i] = arr[i-2] + arr[i-1];


            if(arr[i] > 100) break;
            cnt++;

         }

        
        for(int i =0 ; i <= cnt + 2; i++){
            System.out.print(arr[i]+" ");

        }


        // Please write your code here.
    }
}