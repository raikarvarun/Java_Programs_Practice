/*
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
*/
class Pattern103{
    public static void main(String []arg){
        int n = 5;
        int count = n;
        for(int i = n ; i >=1   ;i--){
            int c  = count;
            for(int j = i ; j<=n ; j++){
                System.out.print(c + "\t");
                c-=j+1;
                
            }
            count+=i-1;
            System.out.println();
        }
        
        
    }
}