/*
e
dd
ccc
bbbb
aaaaa
*/
class Pattern29{
    public static void main(String []arg){
        int n = 5;
        for(int i = n ; i >=1 ;i--){
            for(int j = i ; j <=  5; j++ ){
                System.out.print( (char)(96+i) );
            }
            System.out.println();
        }
        
        
    }
}