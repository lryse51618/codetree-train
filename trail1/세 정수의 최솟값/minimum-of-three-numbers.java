import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() ,b = sc.nextInt() ,c = sc.nextInt(),x,y,z ;

        x = a<=b&&a<=c? a:10000 ;
        y =b<=a&&b<=c? b: 10000;
        z = c<=a&&c<=b? c: 10000 ;


        if (x!=10000){
            System.out.print(a);
        }

        else if (y!=10000){
            System.out.print(b);
        }

        else if (z!=10000){
            System.out.print(c);
        }





        // Please write your code here.
    }
}