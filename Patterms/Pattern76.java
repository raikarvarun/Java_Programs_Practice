/*
11      7       4       2       1
12      8       5       3
13      9       6
14      10
15
*/
class Pattern76{
    public static void main(String []arg){
        int n = 5;
        int count = ((n-1)*n)/2+1 ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = n ; j>=i ; j--){
                System.out.print(c + "\t");
                c-= j-1 ;
            }
            count++;
            System.out.println();
        }
        
        
    }
}