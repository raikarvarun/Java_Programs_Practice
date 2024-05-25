/*
15      10      6       3       1
14      9       5       2
13      8       4
12      7
11
*/
class Pattern77{
    public static void main(String []arg){
        int n = 5;
        int count = ((n+1)*n)/2 ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = n ; j>=i ; j--){
                System.out.print(c + "\t");
                c-= j ;
            }
            count--;
            System.out.println();
        }
        
        
    }
}