/*
*                   *
* * *           * * *
* * * * *   * * * * *
* * * * * * * * * * *
*/
class Pattern14{
    public static void main(String []arg){

        int n = 14  ,temp= 1; 
        for(int i= 1 ; i <=(n/2-1) ; i++){

            
            for(int j = 1 ; j <= (n/2) ; j++){
                if(j<=temp){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            if(i==(n/2-1))
            {
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
            for(int j = 1 ; j <= (n/2) ; j++){
                if(n/2-temp>=j){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
                
            }
            temp+=2 ;
            System.out.println();
        }
        
    }
}