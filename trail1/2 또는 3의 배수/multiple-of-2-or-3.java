import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        //파이프라인
    Scanner sc = new Scanner(System.in);


    //  변수 선언
    int N = sc.nextInt();


    for (int i = 1; i<=N ; i++ ){

        if(i%2==0 || i%3 ==0 ){
            System.out.print(1+" ");
        }

        else{
            System.out.print(0+" ");
        }


    }

    }
}