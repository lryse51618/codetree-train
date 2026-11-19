import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] srr = new int[10];
        int cnt = 0;

        
        
        for(int i = 0; i < 100; i++){

            arr[i] = sc.nextInt();

            if(arr[i] == 0){
                break;
            }
            cnt++;
        }


        for(int i = 0; i < cnt ;i++ ){
            srr[arr[i]/10] = srr[arr[i]/10] + 1 ;
        }

        for(int i = 1; i <= 9; i++){
            System.out.println(i+" - "+srr[i]);

        }

        // Please write your code here.
    }
}