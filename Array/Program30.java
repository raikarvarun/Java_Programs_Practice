/*

30) 
*/
import java.util.Arrays;

class Program30
{
    
    public static void main(String arg[]){
        int a[] = { 1,2,3,4,5,6,7}; 
        double avg = 0  ; 
        for(int i = 0 ; i< a.length ; i++){
           avg+=a[i];
        }
        avg /=a.length;
        int ans = 0 ; 
        if(avg%1==0){
            for(int i = 0 ; i < a.length ;i++){
                if(avg>a[i])
                    ans += (int)avg -a[i]; 
            }
            System.out.print(ans);
        }
        else{
            System.out.println(-1);
        }
          
    }
}