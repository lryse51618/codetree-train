import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       //문자형 변수 선언
       String s , t ,temp ;

       s = sc.next();
       t = sc.next();

       temp = s;
       s = t ;
       t = temp ;

       System.out.println(s);
       System.out.println(t);



    

        // Please write your code here.
    }
}