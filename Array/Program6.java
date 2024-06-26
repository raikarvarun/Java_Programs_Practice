/*

6) WAP to display avg of odd and even elements from array.

*/

class Program6
{
    public static void main(String arg[]){
        int a[] = {10 , 45 , 100 , 4 , 17};
        double avgEven = 0 , avgOdd = 0 ;
        int  noOfOddNumbers= 0 ; 
        for(int i = 0 ; i< a.length ; i++){
            if((a[i]&1)==1){
                avgOdd += a[i]  ; 
                ++noOfOddNumbers;
            }
            else 
                avgEven+=a[i];
        }
        System.out.println("Avg of odd:- "+avgOdd/noOfOddNumbers);  
        System.out.println("Avg of even:- "+avgEven/(a.length-noOfOddNumbers));  

                  
    }
}