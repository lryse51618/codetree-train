import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt() , cnt = 0 , sum = 0;
        String[] str = new String[N];
        

        for(int i = 0; i < N; i++){
            str[i] = sc.next();
        }

        
        char k = sc.next().charAt(0);
        
        for(int i = 0; i < N; i++){
            
            if(str[i].charAt(0) == k){
                cnt++;
                sum = sum + str[i].length();
            }
        }

        System.out.print(cnt+" ");
        System.out.printf("%.2f" , (double)sum / cnt);



        // Please write your code here.
    }
}