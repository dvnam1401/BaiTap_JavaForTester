package level1;

/*
 * Bài Tập: Tính Tổng Các Số Chẵn
 * Mô tả: Viết một hàm tính tổng các số chẵn từ 0 đến một số nguyên dương n cho trước.
 * Yêu cầu:
 * - Hàm nhận vào một số nguyên dương n
 * - Trả về tổng của tất cả các số chẵn từ 0 đến n
 * Ví dụ:
 * - Input: 10 -> Output: 30
 * - Input: 5 -> Output: 6
 */
public class TinhTongCacSoChan {
    
    public static int tinhTongSoChan(int n) {
        int tong = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }
        return tong;
    }
    
    public static void run() {
        System.out.println("=== Tinh Tong Cac So Chan ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        
        int result = tinhTongSoChan(n);
        System.out.println("Tong cac so chan tu 0 den " + n + " la: " + result);
    }
}
