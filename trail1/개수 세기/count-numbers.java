import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt() , M = sc.nextInt();
        int cnt = 0;


        for(int i = 0; i < N; i++){
            int k = sc.nextInt();

            if(k == M)cnt++;

        }
        System.out.print(cnt);

        // Please write your code here.
    }
}