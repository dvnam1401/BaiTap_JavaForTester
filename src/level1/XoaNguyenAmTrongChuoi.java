package level1;

/*
 * Bài Tập: Xóa Nguyên Âm Trong Chuỗi
 * Mô tả: Viết một hàm để xóa tất cả các nguyên âm (a, e, i, o, u) trong một chuỗi ký tự.
 * Yêu cầu:
 * - Hàm sẽ nhận vào một chuỗi và trả về chuỗi đó sau khi đã xóa tất cả các nguyên âm
 * - Không sử dụng các hàm có sẵn để xóa ký tự
 * Ví dụ:
 * - Input: "Cybersoft" -> Output: "Cbrsft"
 * - Input: "hello" -> Output: "hll"
 */
public class XoaNguyenAmTrongChuoi {
    
    public static String xoaNguyenAm(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder result = new StringBuilder();
        String nguyenAm = "aeiouAEIOU";
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            boolean laNguyenAm = false;
            
            for (int j = 0; j < nguyenAm.length(); j++) {
                if (c == nguyenAm.charAt(j)) {
                    laNguyenAm = true;
                    break;
                }
            }
            
            if (!laNguyenAm) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
    
    public static void run() {
        System.out.println("=== Xoa Nguyen Am Trong Chuoi ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        
        String result = xoaNguyenAm(input);
        System.out.println("Ket qua: \"" + result + "\"");
    }
}
