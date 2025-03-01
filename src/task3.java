public class task3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }

    // Use str.charAt(index) to check character directly in string without converting it to character array with str.toCharArray() - which saves space - uses constant space instead of O(n) space
    // Time complexity : O(n)
    // Space complexity : O(1)

    static boolean isPalindrome(String text) {
        int l = 0;
        int r = text.length()-1;
        while(l < r) {
            if(text.charAt(l) != text.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
