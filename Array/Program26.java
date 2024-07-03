/*

26) input: { 217,3475,3852,371,578,27,59,12,2674 }
    output = { 721,5347,2385,137,857,72,95,21,4267 }
*/

class Program26
{
    
    public static void main(String arg[]){
        int a[] = { 217,3475,3852,371,578,27,59,12,2674 }; 

        for(int i = 0 ; i< a.length ; i++){
            int n = a[i] , lengthOfN = 1 ;
            while(n!=0){

                n/=10;
                lengthOfN*=10;
            }
            a[i] = (a[i]/10) + ((a[i]%10)*lengthOfN/10);
        }

        for(int i = 0 ; i< a.length ; i++){
            System.out.print(a[i] +" ");
        }   
    }
}