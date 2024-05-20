/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
*/
class Pattern7{
    public static void main(String []arg){

        int n = 5 ; 
        for(int i= 1 ; i <= n ; i++){
            for(int j = 1 ; j <=n ; j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
        
    }
}