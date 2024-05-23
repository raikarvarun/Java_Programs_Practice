/*
eeeee
 dddd
  ccc
   bb
    a
*/
class Pattern53{
    public static void main(String []arg){
        int n = 5;
        for(int i = n ; i >=1   ;i--){
            for(int j = i ; j<5 ; j++){
                System.out.print(" ");
            }
            for(int j = i ; j >=1; j-- ){
                System.out.print((char)(96+i));
            }
            System.out.println();
        }
        
        
    }
}