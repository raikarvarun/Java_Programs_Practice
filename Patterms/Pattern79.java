/*
1       2       4       7       11
3       5       8       12
6       9       13
10      14
15
*/
class Pattern79{
    public static void main(String []arg){
        int n = 5;
        int count = 1 ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = i ; j<=n ; j++){
                System.out.print(c + "\t");
                c+= j ;
            }
            count+=i+1;
            System.out.println();
        }
        
        
    }
}