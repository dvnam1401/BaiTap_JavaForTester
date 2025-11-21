package level1;

/*
 * Bài Tập: Đếm Số Từ Trong Một Chuỗi
 * Mô tả: Viết một hàm đếm số từ trong một chuỗi.
 * Yêu cầu:
 * - Hàm nhận vào một chuỗi
 * - Trả về số từ trong chuỗi
 * Ví dụ:
 * - Input: "Xin chào các bạn" -> Output: 4
 * - Input: "Hello World" -> Output: 2
 */
public class DemSoTuTrongChuoi {
    
    public static int demSoTu(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        
        String trimmed = input.trim();
        int count = 0;
        boolean inWord = false;
        
        for (int i = 0; i < trimmed.length(); i++) {
            char c = trimmed.charAt(i);
            if (c != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        
        return count;
    }
    
    public static void run() {
        System.out.println("=== Dem So Tu Trong Chuoi ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        
        int result = demSoTu(input);
        System.out.println("So tu trong chuoi: " + result);
    }
}
