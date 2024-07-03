/*

27) input: { 217,3475,3852,371,578,27,59,12,2674 }
    output = { 172,4753,8523,713,785,72,95,21,6742 }
*/

class Program27
{
    
    public static void main(String arg[]){
        int a[] = { 217,3475,3852,371,578,27,59,12,2674 }; 

        for(int i = 0 ; i< a.length ; i++){
            int n = a[i] , fisrtDigit = 0 , otherDigits = 0  , lengthOfN  =10 ;
            while(n!=0){
                otherDigits = fisrtDigit * lengthOfN /10 + otherDigits;
                fisrtDigit = n%10;
                n/=10;
                lengthOfN*=10;
            }
            a[i] = otherDigits +  fisrtDigit;
        }

        for(int i = 0 ; i< a.length ; i++){
            System.out.print(a[i] +" ");
        }   
    }
}