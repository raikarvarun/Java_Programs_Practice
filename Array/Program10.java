/*

10) WAP to shift first element to last.(left shift by 1)

*/

class Program10
{
    public static void main(String arg[]){
        int a[] = {10,20,30,40,50};

        int temp =a[0];
        for(int i = 0 ; i< a.length-1 ; i++){
            a[i] = a[i+1];
        }
        a[a.length-1] = temp;
        
        for(int i = 0 ; i < a.length  ; i++)
            System.out.print(a[i]+" ");        
    }
}