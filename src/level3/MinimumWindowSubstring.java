package level3;

/*
 * Bài Tập: Minimum Window Substring
 * Mô tả: Cho hai chuỗi s và t, tìm chuỗi con nhỏ nhất của s chứa tất cả các ký tự trong t.
 * Ví dụ:
 * - Input: s = "ADOBECODEBANC", t = "ABC" -> Output: "BANC"
 */
public class MinimumWindowSubstring {
    
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        
        int[] tCount = new int[128];
        for (int i = 0; i < t.length(); i++) {
            tCount[t.charAt(i)]++;
        }
        
        int required = t.length();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (tCount[c] > 0) {
                required--;
            }
            tCount[c]--;
            
            while (required == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }
                
                char leftChar = s.charAt(left);
                tCount[leftChar]++;
                if (tCount[leftChar] > 0) {
                    required++;
                }
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
    
    public static void run() {
        System.out.println("=== Minimum Window Substring ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Nhap chuoi s: ");
        String s = scanner.nextLine();
        
        System.out.print("Nhap chuoi t: ");
        String t = scanner.nextLine();
        
        String result = minWindow(s, t);
        if (result.isEmpty()) {
            System.out.println("Khong tim thay chuoi con phu hop");
        } else {
            System.out.println("Chuoi con nho nhat: \"" + result + "\"");
        }
    }
}
