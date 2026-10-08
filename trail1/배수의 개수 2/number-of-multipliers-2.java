import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        //파이프라인
    Scanner sc = new Scanner(System.in);


  //  변수 선언
  int cnt = 0 ;
    


    for(int i = 1; i<=10; i++){

        int N = sc.nextInt();
        
        if(N % 2 ==1 ){
            cnt = cnt + 1;
        }




    }
    System.out.print(cnt);


    }
}