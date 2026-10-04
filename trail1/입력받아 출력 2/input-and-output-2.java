import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
       
       
        //  입력 파이프라인 만들기
        Scanner sc = new Scanner(System.in);

        //깂 입력받기
        String str = sc.next() ;
        String[] jb = str.split("-") ;


        System.out.println(jb[0]+jb[1]) ;
        //

        


    }
}