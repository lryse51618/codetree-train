import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int minVal = Integer.MAX_VALUE;
        int cnt = 0 , N = sc.nextInt();

        int[] arr = new int[100];



        for(int i = 0; i < N ; i++){
            
            arr[i]= sc.nextInt();
            if(arr[i] <= minVal){
                minVal = arr[i];
            }
        }

        for(int i = 0; i < N; i++){
            
            if(arr[i] == minVal){
                cnt++;

            }
        }
        
        
        System.out.print(minVal+" ");
        System.out.print(cnt);




        // Please write your code here.
    }
}