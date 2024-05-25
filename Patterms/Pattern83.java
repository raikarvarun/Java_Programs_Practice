/*
o       n       m       l       k
j       i       h       g
f       e       d
c       b
a
*/
class Pattern83{
    public static void main(String []arg){
        int n = 5;
        int count = (n*(n+1))/2 ;
        for(int i = 1 ; i <=n   ;i++){
            for(int j = i ; j<=n ; j++){
                System.out.print((char)(96+count--) + "\t");
                
            }
            
            System.out.println();
        }
        
        
    }
}