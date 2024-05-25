/*
A       C       F       J       O
B       E       I       N
D       H       M
G       L
K
*/
class Pattern90{
    public static void main(String []arg){
        int n = 5;
        int count = 1 ;
        for(int i = 1 ; i <=n   ;i++){
            int c = count;
            for(int j = i ; j<=n ; j++){
                System.out.print((char)(64+c) + "\t");
                c+= j +1;
            }
            count+=i;
            System.out.println();
        }
        
        
    }
}