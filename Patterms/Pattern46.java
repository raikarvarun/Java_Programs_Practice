/*
11111
 2222
  333
   44
    5
*/
class Pattern46{
    public static void main(String []arg){
        int n = 5;
        for(int i = 1 ; i <= n   ;i++){
            for(int j = i ; j>1 ; j--){
                System.out.print(" ");
            }
            for(int j = i ; j <=n; j++ ){
                System.out.print(i);
            }
            System.out.println();
        }
        
        
    }
}