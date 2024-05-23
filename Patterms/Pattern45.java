/*
abcde
bcde
cde
de
e
*/
class Pattern39{
    public static void main(String []arg){
        int n = 5;
        for(int i = 1 ; i <= n   ;i++){
            for(int j = i ; j <=n; j++ ){
                System.out.print((char)(96+j));
            }
            System.out.println();
        }
        
        
    }
}