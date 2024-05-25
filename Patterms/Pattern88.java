/*
K       G       D       B       A
L       H       E       C
M       I       F
N       J
O
*/
class Pattern88{
    public static void main(String []arg){
        int n = 5;
        int count = ((n-1)*n)/2+1 ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = n ; j>=i ; j--){
                System.out.print((char)(64+c) + "\t");
                c-= j-1 ;
            }
            count++;
            System.out.println();
        }
        
        
    }
}