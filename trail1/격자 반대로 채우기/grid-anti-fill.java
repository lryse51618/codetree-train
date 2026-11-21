import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr2d = new int[10][10];
        int k = 1;
        // Please write your code here.

        for(int j = N-1; j >= 0; j--){

            if(N % 2 ==0){
                if(j % 2 == 1){
              
                  for(int i = N-1; i >=0 ; i--){
                
                    arr2d[i][j] = k;
                    k++;
                
                }
            }

              else{

                  for(int i = 0; i < N; i++){
                   arr2d[i][j] = k;
                   k++;
                  }
            }

        }

        else{

             if(j % 2 == 0){
              
                  for(int i = N-1; i >=0 ; i--){
                
                    arr2d[i][j] = k;
                    k++;
                
                }
            }

              else{

                  for(int i = 0; i < N; i++){
                   arr2d[i][j] = k;
                   k++;
                  }
            }
        }
        
        
        
        
        
        
        
        
        
        
        }


        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){

                System.out.print(arr2d[i][j]+" ");
            }

            System.out.println();

        }
   
   
   
   
   
   
    }
}