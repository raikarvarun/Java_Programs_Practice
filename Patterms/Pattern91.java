/*
a       b       d       g       k
c       e       h       l
f       i       m
j       n
o
*/
class Pattern91{
    public static void main(String []arg){
        int n = 5;
        int count = 1 ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = i ; j<=n ; j++){
                System.out.print((char)(96+c) + "\t");
                c+= j ;
            }
            count+=i+1;
            System.out.println();
        }
        
        
    }
}