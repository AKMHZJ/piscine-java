public class Palindrome {
    public static boolean isPalindrome(String s) {
         if (s == null) {
            return false;
        }
        String revs = "";
        for (int i = s.length()-1; i >= 0; i--) {
            revs += s.charAt(i);
        }

        return revs.toLowerCase().equals(s.toLowerCase());
    }
}