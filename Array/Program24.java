/*

24) WAP to find 63 rd twisted prime number.

63th twisted prime number is :-1091
*/

class Program24
{
    static boolean isPrime(int n ){
        boolean ans = true;
        for(int i = 2 ; i<=n/2;i++){
            if(n%i==0){
                ans=false;
                break;
            }
        }
        return ans;
    }
    public static void main(String arg[]){
        int a = 2  , count = 0 , n = 63; 
        while(true){
            if(isPrime(a)){
                // 2 , 3 , 5 , 7 , 11
                int aRev = 0 , temp = a;

                while(temp!=0){
                    aRev*=10;
                    aRev+=temp%10;
                    temp/=10;
                } 


                if(isPrime(aRev)){
                    ++count;
                }
            }
            if(count==n)
                break;
            a++;
        }

        System.out.println(n +"th twisted prime number is :-" + a);     
    }
}