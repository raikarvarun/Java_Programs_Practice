/*
1
12
123
1234
12345
*/
class Pattern24{
    public static void main(String []arg){
        int n = 5;
        for(int i = 1 ; i <=n ;i++){
            for(int j = 1 ; j <=  i; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
        
        
    }
}