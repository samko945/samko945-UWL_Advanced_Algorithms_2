public class task4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ra.ce c,./ar"));
    }

    // Use str.charAt(index) to check character directly in string without converting it to character array with str.toCharArray() - which saves space - uses constant space instead of O(n) space
    // Time complexity : O(n)
    // Space complexity : O(1)

    static boolean isPalindrome(String text) {
        int l = 0;
        int r = text.length() - 1;
        while(l < r) {
            // skip over any non-alphanumeric characters in l
            while(l < r && !Character.isLetterOrDigit(text.charAt(l))) {
                l++;
            }
            // skip over any non-alphanumeric characters in r
            while(l < r && !Character.isLetterOrDigit(text.charAt(r))) {
                r--;
            }
            if(text.charAt(l) != text.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}