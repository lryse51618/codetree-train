import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        //파이프라인
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.print(a);
        }
        
        
        
        else if(b>=a && b>=c){
            System.out.print(b);
        }
        
        
        
        else if( c>=b && c>=a){
            System.out.print(c);
        }

    }
}