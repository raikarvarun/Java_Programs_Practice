/*

14) WAP to reverse an array without using third variable.

*/

class Program14
{
    public static void main(String arg[]){
        int a[] = {10 ,20,30,40,50,60 };
        for(int i = 0 ; i< (a.length/2); i++){
            a[i] += a[a.length-i-1];
            a[a.length-i-1] = a[i] - a[a.length-i-1];
            a[i] -= a[a.length-i-1];
        }

        for(int i = 0 ; i < a.length  ; i++)
            System.out.print(a[i]+" ");        
    }
}