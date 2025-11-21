package level2;

/*
 * Bài Tập: Kiểm Tra Chuỗi Đối Xứng
 * Mô tả: Viết một hàm kiểm tra xem một chuỗi có phải là chuỗi đối xứng (palindrome) không.
 * Yêu cầu:
 * - Hàm nhận vào một chuỗi
 * - Trả về true nếu chuỗi là đối xứng, false nếu không
 * Ví dụ:
 * - Input: "madam" -> Output: true
 * - Input: "hello" -> Output: false
 */
public class KiemTraChuoiDoiXung {
    
    public static boolean laChuoiDoiXung(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }
        
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void run() {
        System.out.println("=== Kiem Tra Chuoi Doi Xung ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        
        boolean result = laChuoiDoiXung(input);
        System.out.println("Ket qua: " + (result ? "Chuoi doi xung" : "Khong phai chuoi doi xung"));
    }
}
