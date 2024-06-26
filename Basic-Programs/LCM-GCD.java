
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long gcd = 1;
        long a = A, b = B;
        
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        gcd = a;
        long lcm = (A * B) / gcd;
        
        Long[] arr = {lcm, gcd};
        return arr;
    
    }
};
