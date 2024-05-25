/*
     5
    45
   345
  2345
 12345
*/
class Pattern63{
    public static void main(String []arg){
        int n = 5;
        for(int i = 1 ; i <=n   ;i++){
            for(int j = i ; j<=n ; j++){
                System.out.print(" ");
            }
            for(int j = n-i+1 ; j <=n; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
        
        
    }
}