import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[10];

        int minVal = Integer.MAX_VALUE;

        
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();}
        
        
        for(int i = 0; i < N; i++){
         

            for(int j = 0; j < N; j++){

             if(arr[j]-arr[i]  == 0) continue;

             if(arr[j] > arr[i]){
                if(arr[j]-arr[i] < minVal) minVal =arr[j]-arr[i] ;
                 }




            }

        }

        System.out.print(minVal);

        // Please write your code here.
    }
}