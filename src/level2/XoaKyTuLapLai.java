package level2;

/*
 * Bài Tập: Xóa Ký Tự Lặp Lại Trong Chuỗi
 * Mô tả: Viết một hàm xóa các ký tự lặp lại trong chuỗi, chỉ giữ lại ký tự xuất hiện đầu tiên của mỗi loại.
 * Yêu cầu:
 * - Hàm nhận vào một chuỗi và trả về chuỗi mới không chứa ký tự lặp lại
 * Ví dụ:
 * - Input: "programming" -> Output: "progamin"
 * - Input: "abca" -> Output: "abc"
 */
public class XoaKyTuLapLai {
    
    public static String xoaKyTuLap(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            boolean daTonTai = false;
            
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == c) {
                    daTonTai = true;
                    break;
                }
            }
            
            if (!daTonTai) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
    
    public static void run() {
        System.out.println("=== Xoa Ky Tu Lap Lai ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        
        String result = xoaKyTuLap(input);
        System.out.println("Ket qua: \"" + result + "\"");
    }
}
