/*

13) WAP to shift first element to last without using third variable.

*/

class Program13
{
    public static void main(String arg[]){
        int a[] = {10,20,30,40,50};

        for(int i = 0 ; i< a.length-1 ; i++){
            a[i] +=a[i+1];
            a[i+1] = a[i] - a[i+1];
            a[i] -= a[i+1];
        }

        for(int i = 0 ; i < a.length  ; i++)
            System.out.print(a[i]+" ");        
    }
}