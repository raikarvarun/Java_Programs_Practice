/*
eeeee
ddddd
ccccc
bbbbb
aaaaa
*/
class Pattern8{
    public static void main(String []arg){

        int n = 5 ; 
        for(int i= 1 ; i <= n ; i++){
            for(int j = 1 ; j <=n ; j++){
                System.out.print((char)(102-i));
            }
            System.out.println();
        }
        
    }
}