import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        // A를 계속해서 저장할 배열-- 아무리 많이 나눠도 9번 나누면 1이니까 하나만 더해서 10칸
        int[] arr = new int[10];
        // 나머지들 담을 배열
        int[] countarr = new int[10];

        arr[0] = sc.nextInt();
        int B = sc.nextInt(), cnt = 0;

        //제곱합 구할 변수
        int jj = 0;

        
        
        for(int i = 1; i < 10; i++){

            arr[i] = arr[i-1] / B;

            if(arr[i] <= 1) break;

            cnt++;

        }

        for(int i = 0; i <= cnt; i++){

            countarr[arr[i]%B]++;

        }

//슬슬 출력
        for(int i = 0; i <= 9; i++){

            countarr[i] = countarr[i] * countarr[i] ;

            jj = jj + countarr[i] ;

        }

System.out.print(jj);




    }
}