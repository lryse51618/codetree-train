import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int length = str.length();
        
        boolean exists1 = false;
        boolean exists2 = false;

        if(str.contains("ee")){
            exists1 = true;
        }


        if(str.contains("ab")){
            exists2 = true;
        }


        //출력
        if(exists1 == true) System.out.print("Yes ");
        
        else System.out.print("No ");

       if(exists2 == true) System.out.print("Yes ");
        
        else System.out.print("No ");
    }
}