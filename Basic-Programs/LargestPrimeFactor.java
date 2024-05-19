class Solution{
    static long largestPrimeFactor(int N) {
        // code here
       
        long i=2;
        long n=N;
        while(i*i<=n){
            if(n%i==0){
               n=n/i;  
            } 
            else 
            {
                 i++; 
            }      
        }
        return n;
    }
}
