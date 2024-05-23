/*
55555
 4444
  333
   22
    1
*/
class Pattern47{
    public static void main(String []arg){
        int n = 5;
        for(int i = n ; i >=1   ;i--){
            for(int j = i ; j<5 ; j++){
                System.out.print(" ");
            }
            for(int j = i ; j >=1; j-- ){
                System.out.print(i);
            }
            System.out.println();
        }
        
        
    }
}