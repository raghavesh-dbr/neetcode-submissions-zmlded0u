class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
            // 3 ^0 =3
             
        }
        return result;
    }
}
