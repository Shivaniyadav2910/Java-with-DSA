
class Solution {
    public static void print_divisors(int n) {
        // code here
        int i=0;
        for(i=1; i<=Math.sqrt(n); i++){
            if(n%i==0)
                System.out.print(i+" ");
            
        
        }
        for( i=i-1; i>=1; i--){
             if( n%i==0 && i!=n/i)
                    System.out.print((n/i)+" ");
                
        }
    }
}
