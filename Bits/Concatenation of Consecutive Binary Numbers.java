1680. Concatenation of Consecutive Binary Numbers
https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/

// Time Complexity: O(N)
// Space Complexity: O(1)
// where N is n.
class Solution {

    // Approach:
    // Using bit manipulation as described below.
    // A bit of description for the bitwise operations used, if you are not familiar.
    // 1. & - Bitwise AND operation:
    //    0 & 0 = 0,
    //    1 & 0 = 0,
    //    1 & 1 = 1.
    //    Example : 1101 & 1010 = 1000
    //
    // 2. << - Shift Left operation, by n position:
    //    Example:
    //    11 (3) << 2 (n position) = 1100 (14)
   
   
   
   "HERE IS THE EXAMPLES"
   Example 2:

      Input: n = 3
      Output: 27
      Explanation: In binary, 1, 2, and 3 corresponds to "1", "10", and "11".
      After concatenating them, we have "11011", which corresponds to the decimal value 27.
      
   Example 3:

      Input: n = 12
      Output: 505379714
      Explanation: The concatenation results in "1101110010111011110001001101010111100".
      The decimal value of that is 118505380540.
      After modulo 109 + 7, the result is 505379714.

________________________________________________________________________________
================================================================================
________________________________________________________________________________
    public int concatenatedBinary(int n) {

        final long modulo = (long) (1e9 + 7);
        long result = 0;

        // This records the number of binaryDigits we need to shift left.
        int binaryDigits = 0;

        for (int i = 1; i <= n; i++) {

            // If i is a power of 2, we add one additional binaryDigits to shift.
            // Example:
            // i = 8 (1000), i-1 = 7 (111)
            // i & (i-1) = 1000 & 111 = 0
            // So we know we have increased the binaryDigits from 3 (in 111) to 4 (in 1000).
            if ((i & (i - 1)) == 0) {
                binaryDigits++;
            }

            "// With the updated binaryDigits, we now can concatenate i to the result.
            // Each time get the remainder of the result % modulo.
            // Example:
            // i = 2
            // result = 1 (1) << 2 (n position) + 10 (2) = 100 (4) + 10 (2) = 110 (6).
            // i = 3
            // result = 110 (6) << 2 (n position) + 11 (3) = 11000 (24) + 11 (3) = 11011 (27).
            //
            result = ((result << binaryDigits) + i) % modulo;
        }
        return (int) result;
    }
}
