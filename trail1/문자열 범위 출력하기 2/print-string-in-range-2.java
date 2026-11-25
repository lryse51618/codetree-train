import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        
        if(str.length() > n){
        for(int i = str.length() - 1; i > (str.length() - 1) -n; i--){
            System.out.print(str.charAt(i));

            
        }
        }

        else{
            for(int j = str.length()-1; j >=0; j--){
                System.out.print(str.charAt(j));
            }
        }

        // Please write your code here.
    }
}