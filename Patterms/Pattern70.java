/*
1       2       3       4       5
6       7       8       9
10      11      12
13      14
15
*/
class Pattern70{
    public static void main(String []arg){
        int n = 5;
        int count = 1 ;
        for(int i = 1 ; i <=n   ;i++){
            for(int j = i ; j<=n ; j++){
                System.out.print(count++ + "\t");
                
            }
            
            System.out.println();
        }
        
        
    }
}