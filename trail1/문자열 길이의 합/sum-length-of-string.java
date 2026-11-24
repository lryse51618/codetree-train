import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt() , sum = 0, cnt = 0;
        String[] str = new String[10];

        for(int i = 0; i < N; i++){
            str[i] = sc.next();
            sum = sum + str[i].length();

            if(str[i].charAt(0) == 'a') cnt++;
        }

        System.out.print(sum+" ");
        System.out.print(cnt);
        // Please write your code here.
    }
}