import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //학생들 점수 받는 배열(100명 이하)
        int[] arr = new int[100];
        //10점대별로 카운트 해주는 배열
        int[] countarr = new int[11];

        // 점수 몇개까지 받고 터졌는지 개수 확인 목적
        int cnt = 0;

        for(int i = 0; i < 100; i++){

            arr[i] = sc.nextInt();

            if(arr[i] == 0){break;}
            cnt++;
        }

        for(int i = 0; i < cnt; i++){

            countarr[arr[i]/10]++;
        }


        //출력을 위한 반복문! 사람이 읽기 좋게!
        for(int i = 10; i >= 1; i-- ){
            System.out.println(i*10 + " - " + countarr[i]);
        }




      
    }
}