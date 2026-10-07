import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //파이프라인
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

        //8월 이전  
       if(n%2==1 && n<8){
        System.out.print(31);
       }

       else if(n%2==0 && n<8){
           if (n == 2){
            System.out.print(28);
            }
          
            
            else{System.out.print(30);
            }
       }
     
        
        //8월 이후
        
        if(n%2 == 1 && n >=8){
            System.out.print(30);

        }
        else if(n%2 == 0 && n>=8){
            System.out.print(31);
        }
        }



       


        // Please write your code here.
    }
