import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr2d = new char[5][3];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){

                arr2d[i][j] = sc.next().charAt(0);

                System.out.print(Character.toUpperCase(arr2d[i][j])+" ");

            }

            System.out.println();
        }
        // Please write your code here.
    }
}