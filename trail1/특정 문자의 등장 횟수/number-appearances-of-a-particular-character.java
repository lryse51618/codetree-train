import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int length = str.length();
        int cnt1 = 0 , cnt2 = 0;

        for(int i = 0; i < length -1; i++){

            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'e'){
                cnt1 = cnt1 + 1;
            }

             if(str.charAt(i) == 'e' && str.charAt(i+1) == 'b'){
                cnt2 = cnt2 + 1;
            }
        }

        System.out.print(cnt1+" ");
        System.out.print(cnt2);
        // Please write your code here.
    }
}