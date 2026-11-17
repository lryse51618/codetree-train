import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] jrr = new int[N];


        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();


            if(arr[i] % 2 == 0) {
                jrr[i] = arr[i];

                System.out.print(jrr[i]+" ");


            }
            
         }

       
    }
}