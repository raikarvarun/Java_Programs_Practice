/*
e       i       l       n       o
d       h       k       m
c       g       j
b       f
a
*/
class Pattern87{
    public static void main(String []arg){
        int n = 5;
        int count = n ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = n ; j>=i ; j--){
                System.out.print((char)(96+c) + "\t");
                c+= j-1 ;
            }
            count--;
            System.out.println();
        }
        
        
    }
}