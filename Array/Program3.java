/*

3) WAP to display sum of odd elements from an array.

*/

class Program3
{
    public static void main(String arg[]){
        int a[] = {10 , 45 , 100 , 4 , 17};
        int sum = 0 ; 
        for(int i = 0 ; i< a.length ; i++){
            if((a[i]&1)==1)
                sum += a[i] ; 
        }
        System.out.print(sum+" ");  

        
                  
    }
}