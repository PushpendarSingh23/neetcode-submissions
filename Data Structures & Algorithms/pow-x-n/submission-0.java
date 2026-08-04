class Solution {
    public double myPow(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1;

        for (long i = 0; i < power; i++) {
            result *= x;
        }

        return result;
    }
}