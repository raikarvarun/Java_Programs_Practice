/*
A
AB
ABC
ABCD
ABCDE
*/
class Pattern30{
    public static void main(String []arg){
        int n = 5;
        for(int i = 1 ; i <=n ;i++){
            for(int j = 1 ; j <=  i; j++ ){
                System.out.print( (char)(64+j));
            }
            System.out.println();
        }
        
        
    }
}