/*
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
*/
class Pattern9{
    public static void main(String []arg){

        int n = 5 ; 
        for(int i= 1 ; i <= n ; i++){
            for(int j = 1 ; j <=n ; j++){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
        
    }
}