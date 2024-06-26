/*

5) WAP to display avg of odd elements from an array.

*/

class Program5
{
    public static void main(String arg[]){
        int a[] = {10 , 45 , 100 , 4 , 17};
        double avg = 0  , noOfOddNumbers= 0 ; 
        for(int i = 0 ; i< a.length ; i++){
            if((a[i]&1)==1){
                avg += a[i]  ; 
                ++noOfOddNumbers;
            }
        }
        System.out.print(avg/noOfOddNumbers+" ");  
                  
    }
}