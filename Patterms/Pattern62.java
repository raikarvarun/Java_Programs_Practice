/*
     5
    54
   543
  5432
 54321
*/
class Pattern62{
    public static void main(String []arg){
        int n = 5;
        for(int i = 1 ; i <=n   ;i++){
            for(int j = i ; j<=n ; j++){
                System.out.print(" ");
            }
            for(int j = n ; j >(n-i); j-- ){
                System.out.print(j);
            }
            System.out.println();
        }
        
        
    }
}