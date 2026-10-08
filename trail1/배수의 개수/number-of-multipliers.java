import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        //파이프라인
        Scanner sc = new Scanner(System.in);


        //  변수 선언
        int cnt3 = 0 , cnt5 = 0;


        for(int i = 1; i <= 10; i++){

            int a = sc.nextInt();

            if(a%3==0){
                cnt3 = cnt3 + 1;
            }



            if(a%5==0){
                cnt5 = cnt5 + 1;
            }






        }

        System.out.print(cnt3+" "+cnt5);




    }
}