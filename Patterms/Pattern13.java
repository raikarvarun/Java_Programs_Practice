/*
 * 
       *  *
    *  *  *
 *  *  *  *
*/
class Pattern13{
    public static void main(String []arg){

        int n = 4 ; 
        for(int i= 1 ; i <=n ; i++){
            for(int j = 1 ; j <=n ; j++){
                if(i==1){
                    System.out.print(" * ");
                    break;
                }
                if(n-i>=j){
                    System.out.print("   ");
                }
                else
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}