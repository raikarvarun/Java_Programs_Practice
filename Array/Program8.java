/*

8) WAP to sum of those element which contains 4 digit in their element.

*/

class Program8
{
    public static void main(String arg[]){
        int a[] = {123 , 452 , 7548};
        int sum = 0 ;
        for(int i = 0 ; i< a.length ; i++){
            int n = a[i];
            while(n!=0){
                if(n%10==4){
                    sum+=a[i];
                    break;
                }
                n/=10;
            }
            
        }

        System.out.print(sum+" ");        
    }
}