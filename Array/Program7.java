/*

7) WAP to find greater number than avg of an array.

*/

class Program7
{
    public static void main(String arg[]){
        int a[] = {10 , 45 , 100 , 4 , 18};
        double avg = 0 ; 
        for(int i = 0 ; i< a.length ; i++){
            avg += a[i] ; 
        }
        avg/=a.length;
        for(int i = 0 ; i < a.length  ; i++){
            if(avg<a[i])
                System.out.print(a[i]+" ");  
        }
                  
    }
}