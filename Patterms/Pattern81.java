/*
15      14      12      9       5
13      11      8       4
10      7       3
6       2
1
*/
class Pattern81{
    public static void main(String []arg){
        int n = 5;
        int count = ((n+1)*n)/2 ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = i ; j<=n ; j++){
                System.out.print(c + "\t");
                c-= j ;
            }
            count-=i+1;
            System.out.println();
        }
        
        
    }
}