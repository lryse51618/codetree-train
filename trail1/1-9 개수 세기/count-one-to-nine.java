import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[100];
    int[] newrr = new int[10];

    
    for(int i = 0; i < N; i++){

        arr[i] = sc.nextInt();
    }

    for(int i = 0 ; i < N; i++){

        newrr[arr[i]] = newrr[arr[i]] + 1;


    }

    for(int i = 1; i < 10; i++){
        System.out.println(newrr[i]);
    }
        // Please write your code here.
    }
}