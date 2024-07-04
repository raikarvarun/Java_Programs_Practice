/*

29) input: { 14,12,17,14,24,22,,20,15,18,27,19,11,8 }
    output = { 14 -3 17 14 -3 22 -1 15 -2 27 19 11 -1  }
*/
import java.util.Arrays;

class Program29
{
    
    public static void main(String arg[]){
        int a[] = { 14,12,17,14,24,22,20,15,18,27,19,11,8 }; 

        for(int i = 0 ; i< a.length ; i++){
           if(a[i]%4==0 && a[i]%6==0){
                a[i]= -3 ; 
           }
           else if(a[i]%4==0){
                a[i] = -1;
           }
           else if(a[i]%6==0){
                a[i] = -2;
           }
        }

        for(int i = 0 ; i< a.length ; i++){
            System.out.print(a[i] +" ");
        }   
    }
}