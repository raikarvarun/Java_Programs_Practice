/*
A       F       J       M       O
B       G       K       N
C       H       L
D       I
E
*/
class Pattern86{
    public static void main(String []arg){
        int n = 5;
        int count = 1 ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = n ; j>=i ; j--){
                System.out.print((char)(64+c) + "\t");
                c+= j ;
            }
            count++;
            System.out.println();
        }
        
        
    }
}