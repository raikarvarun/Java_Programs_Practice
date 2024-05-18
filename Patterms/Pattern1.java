/*
* * * * * * * * * * * * * * * * * * * * * * * * *
  *           *   *           *   *           *
    *       *       *       *       *       *
      *   *           *   *           *   *
        *               *               *
      *   *           *   *           *   *
    *       *       *       *       *       *
  *           *   *           *   *           *
* * * * * * * * * * * * * * * * * * * * * * * * *
*/

class Pattern1{
    public static void main(String []arg){
        
        int n = 3; //No of cross
        int h = 9 ; //Height of cross
        for(int k=1;k<=h;k++){
            
            for(int y=1; y<=n ; y++){
                
                for(int j=1;j<=h-1;j++){
                    if(k>=2 && k<=h-1){
                        if(k==j || (h+1-j)==k){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                if(y==n && (k==1 || k==h))
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
        
    }
}