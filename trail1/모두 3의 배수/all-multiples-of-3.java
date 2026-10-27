import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);

      boolean flag = true;
      int i = 0 ;

      while(i < 5){
        int N = sc.nextInt();


         if(N % 3 != 0)
           flag = false ;
        
        
        
        i++;
      }

        if(flag == true)
        System.out.print(1);

        else
        System.out.print(0);



    }
}