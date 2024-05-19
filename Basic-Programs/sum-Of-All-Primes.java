class Solution{
    
   static boolean isPrime(int n){
      
        if(n<=1) {  //0 0r 1 not prime
          return false;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0)
               return false;
        }
   return true;
    
   }
    static int primeSum(int N){
        // code here
        int sum=0;
       
        
        while(N>0){
         
            int digit=N%10;
            if(isPrime(digit)){
              sum=sum+digit; 
            }
           
            N=N/10;
        }

       return  sum;
    }
}
