class Solution {
    public int hammingWeight(int n) {
        int count = 0;                         // number of bits

        while(n != 0) {
            count += (n & 1);                  // add last bit
            n >>>= 1;                          // shift right
        }

        return count;
    }
}
