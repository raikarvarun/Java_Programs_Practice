/*

4) WAP to display sum of odd and even element from an array.

*/

class Program4
{
    public static void main(String arg[]){
        int a[] = {10 , 45 , 100 , 4 , 17};
        int sumEven = 0  , sumOdd = 0; 
        for(int i = 0 ; i< a.length ; i++){
            if((a[i]&1)==1)
                sumOdd += a[i] ; 
            else
                sumEven += a[i] ; 
        }
        System.out.println("Sum of Even:- "+sumEven);
        System.out.println("Sum of Odd:- "+sumOdd);  

                  
    }
}