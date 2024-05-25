/*
    e
   dd
  ccc
 bbbb
aaaaa
*/
class Pattern65{
    public static void main(String []arg){
        int n = 5;
        for(int i = n ; i >=1   ;i--){
            for(int j = i ; j>1 ; j--){
                System.out.print(" ");
            }
            for(int j = i ; j <=n; j++ ){
                System.out.print((char)(96+i));
            }
            System.out.println();
        }
        
        
    }
}