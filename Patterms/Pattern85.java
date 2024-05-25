/*
k       l       m       n       o
g       h       i       j
d       e       f
b       c
a
*/
class Pattern85{
    public static void main(String []arg){
        int n = 5;
        int count = ((n-1)* n )/2 + 1 ;
        for(int i = n ; i >=1    ;i--){
            int c = count;
            for(int j = i ; j>=1 ; j--){
                System.out.print((char)(96+c++) + "\t");
                
            }
            count -= i-1 ;
            System.out.println();
        }
        
        
    }
}