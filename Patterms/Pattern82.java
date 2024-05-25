/*
A       B       C       D       E
F       G       H       I
J       K       L
M       N
O
*/
class Pattern82{
    public static void main(String []arg){
        int n = 5;
        int count = 1 ;
        for(int i = 1 ; i <=n   ;i++){
            for(int j = i ; j<=n ; j++){
                System.out.print((char)(64+count++) + "\t");
                
            }
            
            System.out.println();
        }
        
        
    }
}