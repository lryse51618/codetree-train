import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //파이프라인
        Scanner sc = new Scanner(System.in);

        //변수 설정
        int y = sc.nextInt();

        if(y%4 == 0){
          
            if(y%100==0 && y%400==0 ){
                System.out.print("true");

            }
            else if (y%100 == 0 && y%400 != 0){
                System.out.print("false");

            }
            else{
                System.out.print("true");
            }
       
      
        }

        else{
            System.out.print("false");
        }

   
    }
}