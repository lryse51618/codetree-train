import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력파이프라인
        Scanner sc = new Scanner(System.in);

    
      
    
        int sum = 0;
        int k = 0 ;
        double i = 1;


     while(i<=10){
            
            int a = sc.nextInt();
            

            if(a >= 0 && a <= 200){

                sum = sum + a;
                k = k + 1;


        }
         i = i + 1;

     }
        

    System.out.printf(sum+" "+"%.1f" ,(double)sum/k);


    }
}