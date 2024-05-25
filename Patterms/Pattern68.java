/*
     E
    ED
   EDC
  EDCB
 EDCBA
*/
class Pattern68{
    public static void main(String []arg){
        int n = 5;
        for(int i = 1 ; i <=n   ;i++){
            for(int j = i ; j<=n ; j++){
                System.out.print(" ");
            }
            for(int j = n ; j >(n-i); j-- ){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
        
        
    }
}