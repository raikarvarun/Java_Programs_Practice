/*
11      12      13      14      15
7       8       9       10
4       5       6
2       3
1
*/
class Pattern73{
    public static void main(String []arg){
        int n = 5;
        int count = ((n-1)* n )/2 + 1 ;
        for(int i = n ; i >=1    ;i--){
            int c = count;
            for(int j = i ; j>=1 ; j--){
                System.out.print(c++ + "\t");
                
            }
            count -= i-1 ;
            System.out.println();
        }
        
        
    }
}