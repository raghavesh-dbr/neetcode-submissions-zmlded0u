class Solution {
    public int[] plusOne(int[] digits) {
        long result=0;
        for(int i=0;i<digits.length;i++){
            result=(result*10)+digits[i];
        }
        result+=1;
        String s = Long.toString(result);
        int[] result1 = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result1[i] = Character.getNumericValue(s.charAt(i));
        }
        return result1;
    }
}
