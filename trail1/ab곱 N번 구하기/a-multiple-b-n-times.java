import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
       


        for(int i = 0; i < N; i++){

             int a = sc.nextInt() , b = sc.nextInt();
             int p = 1;

             for(int j = a; a <= b; a++){

                p = p * a;
            
                  }
             
             System.out.println(p);


        }
       
        // Please write your code here.
    }
}