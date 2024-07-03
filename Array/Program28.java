/*

28) input: { 217,3475,3852,371,578,27,59,12,2674 }
    output = { 127,3457,2358,137,578,27,59,12,2467 }
*/
import java.util.Arrays;

class Program28
{
    
    public static void main(String arg[]){
        int a[] = { 217,3475,3852,371,578,27,59,12,2674 }; 

        for(int i = 0 ; i< a.length ; i++){
            int n = a[i] , lengthOfN  =0 ;
            while(n!=0){
                n/=10;
                ++lengthOfN;
            }
            int[] ans = new int[lengthOfN];
            int countAns = 0 ;
            n = a[i];
            while(n!=0){
                ans[countAns] = n%10;
                n/=10;
                countAns++;
            }
            Arrays.sort(ans);
            int ans1 = ans[0] ; 
            for(int j = 1 ; j< ans.length ; j++){
                ans1  = ans1 *10 + ans[j];
            }
            a[i] = ans1;
        }

        for(int i = 0 ; i< a.length ; i++){
            System.out.print(a[i] +" ");
        }   
    }
}