class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Simple case: No carry needed
                return digits;
            }
            
            digits[i] = 0; // It was a 9, so it becomes 0, and loop continues
        }

        // Edge case: If we finished the loop, the number was all 9s (e.g., 999)
        // We need a new array like [1, 0, 0, 0]
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; 
        return newNumber;
    }
}