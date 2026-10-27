import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() , b = sc.nextInt(), c = sc.nextInt();
        //새로운 변수 등장
        boolean flag = false ;



        for(int i = a ; i <= b ; i++){

            if(i % c == 0)
                flag = true;

        }

        if(flag == true)
        System.out.print("YES");

        else 
        System.out.print("NO");

        // Please write your code here.
    }
}