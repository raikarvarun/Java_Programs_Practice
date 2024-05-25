/*
o       n       l       i       e
m       k       h       d
j       g       c
f       b
a
*/
class Pattern93{
    public static void main(String []arg){
        int n = 5;
        int count = ((n+1)*n)/2 ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = i ; j<=n ; j++){
                System.out.print((char)(c+96) + "\t");
                c-= j ;
            }
            count-=i+1;
            System.out.println();
        }
        
        
    }
}