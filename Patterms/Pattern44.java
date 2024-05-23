/*
edcba
dcba
cba
ba
a
*/
class Pattern44{
    public static void main(String []arg){
        int n = 5;
        for(int i = n ; i  >=1  ;i--){
            for(int j = i ; j>=1 ; j-- ){
                System.out.print((char)(96+j));
            }
            System.out.println();
        }
        
        
    }
}