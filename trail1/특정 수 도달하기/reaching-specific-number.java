import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0 , cnt = 0;

        
        //값 담기
        for(int i = 0; i < 10; i++){

            arr[i] = sc.nextInt();

        }


        //작업 시작
        for(int j = 0; j < 10; j++){

            if(arr[j] >= 250) break;
            
                 sum = sum + arr[j];
                 cnt = cnt + 1;
              }
      
        System.out.printf("%d %.1f" , sum,(double)sum/cnt);



        // Please write your code here.
    }
}