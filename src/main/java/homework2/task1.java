public class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        for (long i = Math.abs((long)n); i > 0 ; i >>= 1, x *= x) {
            if ((i & 1) == 1) result *= x;
        }
        return n >= 0 ? result : 1/ result;
    }
}