import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        //파이프라인 만들기
        Scanner sc = new Scanner(System.in);


         //변수 입력
        int s = sc.nextInt() , n = sc.nextInt() ; 



      if(s == 0){
            if(n >= 19){
                System.out.print("MAN");

            }
            else{
                System.out.print("BOY");
            }


     }
      else if(s == 1){
            if(n >= 19){
                System.out.print("WOMAN");

            }
            else{
                System.out.print("GIRL");
            }

      }


    }
}