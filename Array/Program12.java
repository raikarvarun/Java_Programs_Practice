/*

12) WAP to swap first and last digit without third variable.

*/

class Program12
{
    public static void main(String arg[]){
        int a[] = {123 , 4512 ,10 ,20 ,30, 7548};

        a[0] += a[a.length-1]; 
        a[a.length-1] = a[0] - a[a.length-1];
        a[0] -= a[a.length-1]; 

        for(int i = 0 ; i < a.length  ; i++)
            System.out.print(a[i]+" ");        
    }
}