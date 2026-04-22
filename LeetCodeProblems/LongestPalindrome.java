public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "abrbadaadab";
        System.out.println(longestPalindrome(str));
    }

    static String longestPalindrome(String str) {
        if (str.length() <= 1)
            return str;
        String LPS = "";

        for (int i = 1; i < str.length(); i++) {
            int low = i;
            int high = i;

            while (str.charAt(low) == str.charAt(high)) {
                low--;
                high++;

                if (low == -1 || high == str.length())
                    break;
            }
            String palindrome = str.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }

            low = i - 1;
            high = i;
            while (str.charAt(low) == str.charAt(high)) {
                low--;
                high++;

                if (low == -1 || high == str.length())
                    break;
            }
            palindrome = str.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
        }
        // System.out.println(LPS.length());
        return LPS;
    }
}