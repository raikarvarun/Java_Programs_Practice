/*
15      13      10      6       1
14      11      7       2
12      8       3
9       4
5
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