/*

25) WAP to find 72th palindromic prime number.

72th palindromic prime number is :-1091
*/

class Program25
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
        int a = 2  , count = 0 , n = 72; 
        while(true){
            int aRev = 0 , temp = a;

                while(temp!=0){
                    aRev*=10;
                    aRev+=temp%10;
                    temp/=10;
                }
            if(a==aRev){
                if(isPrime(aRev)){
                    ++count;
                }
            }
            if(count==n)
                break;
            a++;
        }

        System.out.println(n +"th palindromic prime number is :-" + a);     
    }
}