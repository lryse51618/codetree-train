import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        //변수 선언
        int as = sc.nextInt() , ay = sc.nextInt() , bs = sc.nextInt() , by = sc.nextInt() ; 



         if(as > bs){
            System.out.print("A");

         }
         else if(as < bs){
            System.out.print("B");
         }


         else if(as == bs && ay>by){
            System.out.print("A");

         }

        else if(as == bs && ay<by){
            System.out.print("B");

         }












    }
}