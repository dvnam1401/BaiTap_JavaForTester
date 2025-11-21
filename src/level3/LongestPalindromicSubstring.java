package level3;

/*
 * Bài Tập: Longest Palindromic Substring
 * Mô tả: Tìm chuỗi con đối xứng (palindromic substring) dài nhất trong một chuỗi cho trước.
 * Ví dụ:
 * - Input: "babad" -> Output: "bab" (hoặc "aba", vì cả hai đều là chuỗi con đối xứng dài nhất)
 */
public class LongestPalindromicSubstring {
    
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        
        int start = 0;
        int maxLen = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int len1 = moRongTuTamGiua(s, i, i);
            int len2 = moRongTuTamGiua(s, i, i + 1);
            int len = Math.max(len1, len2);
            
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }
        
        return s.substring(start, start + maxLen);
    }
    
    private static int moRongTuTamGiua(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    
    public static void run() {
        System.out.println("=== Longest Palindromic Substring ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        
        String result = longestPalindrome(input);
        System.out.println("Chuoi con doi xung dai nhat: \"" + result + "\"");
    }
}
