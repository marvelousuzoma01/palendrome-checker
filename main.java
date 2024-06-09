
public class Main {
    
    public void isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                System.out.println(word + " is not a palindrome.");
                return;
            }
            left++;
            right--;
        }
        System.out.println(word + " is a palindrome.");
    }

    public static void main(String[] args) {
        Main fun = new Main();
        fun.isPalindrome("madam");
    }
}
