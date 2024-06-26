/*

2) WAP to display sum of element from an array.

*/

class Program2
{
    public static void main(String arg[]){
        int a[] = {10 , 45 , 100 , 4 , 18};
        int sum = 0 ; 
        for(int i = 0 ; i< a.length ; i++){
            sum += a[i] ; 
        }
        System.out.print(sum+" ");  
        
                  
    }
}