package level1;

/*
 * Bài Tập: In Chữ Cái Đầu Của Mỗi Từ
 * Mô tả: Viết một hàm in ra chữ cái đầu tiên của mỗi từ trong một chuỗi.
 * Yêu cầu:
 * - Hàm nhận vào một chuỗi
 * - Trả về chuỗi chứa các chữ cái đầu của mỗi từ
 * Ví dụ:
 * - Input: "Xin chào các bạn" -> Output: "X C C B"
 * - Input: "Hello World" -> Output: "H W"
 */
public class InChuCaiDauMoiTu {
    
    public static String layChuCaiDau(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        String trimmed = input.trim();
        boolean batDauTu = true;
        
        for (int i = 0; i < trimmed.length(); i++) {
            char c = trimmed.charAt(i);
            if (c != ' ') {
                if (batDauTu) {
                    if (result.length() > 0) {
                        result.append(" ");
                    }
                    result.append(c);
                    batDauTu = false;
                }
            } else {
                batDauTu = true;
            }
        }
        
        return result.toString();
    }
    
    public static void run() {
        System.out.println("=== In Chu Cai Dau Moi Tu ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        
        String result = layChuCaiDau(input);
        System.out.println("Chu cai dau moi tu: \"" + result + "\"");
    }
}
