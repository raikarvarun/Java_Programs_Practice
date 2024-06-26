/*

9) WAP to replace each element with their sum of digits.

*/

class Program9
{
    public static void main(String arg[]){
        int a[] = {123 , 4512 , 7548};

        for(int i = 0 ; i< a.length ; i++){
            int sum = 0 ; 
            while(a[i]!=0){
                sum+=a[i]%10;
                a[i]/=10;
            }
            a[i] = sum;
        }

        for(int i = 0 ; i < a.length  ; i++)
            System.out.print(a[i]+" ");        
    }
}