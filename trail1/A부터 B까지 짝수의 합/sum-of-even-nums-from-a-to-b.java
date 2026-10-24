import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 변수 설정
        int A = sc.nextInt() , B = sc.nextInt();
        int sum = 0 ;
        for(int i = A; i <= B ; i++){

            if(i % 2 == 0){
                sum = sum + i;
            }

        }
        System.out.println(sum);

    }
}