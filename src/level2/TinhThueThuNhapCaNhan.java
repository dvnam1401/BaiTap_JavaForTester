package level2;

import java.util.Scanner;

/*
 * Bài Tập: Tính Thuế Thu Nhập Cá Nhân
 * Mô tả: Viết một chương trình Java tính thuế thu nhập cá nhân dựa trên mức thu nhập hàng năm.
 * Yêu cầu:
 * - Nhập thu nhập hàng năm từ người dùng
 * - Tính số thuế phải trả theo từng mức thuế suất:
 *   + Thu nhập từ 0 đến 5 triệu đồng: 5%
 *   + Thu nhập từ 5 triệu đến 10 triệu đồng: 10%
 *   + Thu nhập từ 10 triệu đến 18 triệu đồng: 15%
 *   + Thu nhập từ 18 triệu đến 32 triệu đồng: 20%
 *   + Thu nhập từ 32 triệu đến 52 triệu đồng: 25%
 *   + Thu nhập từ 52 triệu đến 80 triệu đồng: 30%
 *   + Thu nhập trên 80 triệu đồng: 35%
 * - Xuất số thuế phải trả
 */
public class TinhThueThuNhapCaNhan {
    
    public static double tinhThue(double thuNhap) {
        double thue = 0;
        
        if (thuNhap <= 5) {
            thue = thuNhap * 0.05;
        } else if (thuNhap <= 10) {
            thue = 5 * 0.05 + (thuNhap - 5) * 0.10;
        } else if (thuNhap <= 18) {
            thue = 5 * 0.05 + 5 * 0.10 + (thuNhap - 10) * 0.15;
        } else if (thuNhap <= 32) {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + (thuNhap - 18) * 0.20;
        } else if (thuNhap <= 52) {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + (thuNhap - 32) * 0.25;
        } else if (thuNhap <= 80) {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + (thuNhap - 52) * 0.30;
        } else {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + 28 * 0.30 + (thuNhap - 80) * 0.35;
        }
        
        return thue;
    }
    
    public static void run() {
        System.out.println("=== Tinh Thue Thu Nhap Ca Nhan ===");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap thu nhap hang nam (trieu dong): ");
            double thuNhap = scanner.nextDouble();
            
            double thue = tinhThue(thuNhap);
            System.out.printf("So thue phai tra: %.2f trieu dong\n", thue);
        }
    }
}
