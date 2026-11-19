import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        
        //주사위 들어갈 값. 사람이 세기 좋게 하나 더 해서 7칸으로 만들기
        int[] count_arr = new int[7] ;

        //10번 굴려서 일단 나온 값들 담기.
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            count_arr[arr[i]] = count_arr[arr[i]] + 1;
        }

        for(int i = 1; i < 7; i++){
            System.out.println(i + " - " + count_arr[i]);

        }
        
        // Please write your code here.
    }
}