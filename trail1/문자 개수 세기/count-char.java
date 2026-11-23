import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String str = sc.nextLine();
        char c = sc.next().charAt(0);

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == c){
                cnt++;
            }
        }

        System.out.print(cnt);
        // Please write your code here.
    }
}