/*
e
de
cde
bcde
abcde
*/
class Pattern33{
    public static void main(String []arg){
        int n = 5;
        for(int i = n ; i >=1 ;i--){
            for(int j = i ; j <=  5; j++ ){
                System.out.print((char)(96+j));
            }
            System.out.println();
        }
        
        
    }
}