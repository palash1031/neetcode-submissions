class Solution {
    public boolean isPalindrome(String s) {
        char[] sArr = s.toLowerCase().toCharArray();
        int i = 0;
        int j = s.length()-1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(sArr[i])) i++;
            while (i < j && !Character.isLetterOrDigit(sArr[j])) j--;
            
            if (sArr[i] != sArr[j]) return false;
            
            i++;
            j--;
        }
        return true;
    }
}
