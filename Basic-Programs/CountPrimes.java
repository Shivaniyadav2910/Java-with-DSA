class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {    // checking 0 and 1
            return 0;
        }
                 // composite->True and Prime -->false
        boolean[] composite = new boolean[n];
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (composite[i] == false) {
                for (int j = i * i; j < n; j += i) {
                    composite[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (composite[i] == false) {
                count++;
            }
        }
        return count;

    }
}
