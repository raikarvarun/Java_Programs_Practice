/*
o       j       f       c       a
n       i       e       b
m       h       d
l       g
k
*/
class Pattern89{
    public static void main(String []arg){
        int n = 5;
        int count = ((n+1)*n)/2 ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = n ; j>=i ; j--){
                System.out.print((char)(96+c) + "\t");
                c-= j ;
            }
            count--;
            System.out.println();
        }
        
        
    }
}