/*
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
*/
class Pattern98{
    public static void main(String []arg){
        int n = 5;
        int count = 1;
        for(int i = n ; i >=1   ;i--){
            int c  = count;
            for(int j = n ; j>=i ; j--){
                System.out.print(c + "\t");
                c+=j-1;
                
            }
            ++count;
            System.out.println();
        }
        
        
    }
}