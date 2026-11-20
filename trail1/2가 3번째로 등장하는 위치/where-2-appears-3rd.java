import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[100];
        
        //2개수 세는 변수
        int cnt2 = 0;
        //2가 3번쨰로 등장할때까지 횟수
        int cnt = 0;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
             cnt++;


            if(arr[i] == 2){
                cnt2++;

                if(cnt2 == 3)break;
            }
        

        }

        System.out.print(cnt);
        // Please write your code here.
    }
}