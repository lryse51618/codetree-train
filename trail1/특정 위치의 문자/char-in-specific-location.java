import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[] alp = new char[]{'L' , 'E' , 'B' , 'R' , 'O' , 'S'};

        Scanner sc = new Scanner(System.in);
        char w = sc.next().charAt(0);

        int cnt = 0;

        
        for(int i = 0; i < 6; i++){

            //이걸 몰라서 헤맸음
            if(alp[i] == w){
                System.out.print(i);
                break;
            }
            cnt++;

        }

        if(cnt == 6){
            System.out.print("None");
        }

        // Please write your code here.
    }
}