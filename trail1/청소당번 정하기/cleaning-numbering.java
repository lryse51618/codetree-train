import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
    //파이프라인
    Scanner sc = new Scanner(System.in);

    //n일간~ 고정
    int n = sc.nextInt() ;
    //개수 변수 선언
    int clrm = 0 , hall = 0 , bath = 0 ;




    for(int i = 1; i <= n; i++){
        if(i%12==0){
            bath = bath + 1;
        }

        else if(i%3==0){
            hall = hall + 1;
        
        }
        else if(i%2==0){
            clrm = clrm + 1;
        
    }}
    System.out.print(clrm+" "+hall+" "+bath);


     }
}