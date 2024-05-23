/*
ABCDE
 ABCD
  ABC
   AB
    A
*/
class Pattern54{
    public static void main(String []arg){
        int n = 5;
        for(int i = n ; i >=1   ;i--){

            for(int j = i ; j<5 ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j <=i; j++ ){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
        
        
    }
}