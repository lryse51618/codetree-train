import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;


        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){

            arr[i] = N * (i + 1);

            if(arr[i] % 5 == 0){
                cnt++;

            }

            System.out.print(arr[i]+" ");

            if(cnt == 2)break;


        }
        // Please write your code here.
    }
}