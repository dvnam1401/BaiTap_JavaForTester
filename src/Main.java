import level1.*;
import level2.*;
import level3.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tiepTuc = true;
        
        while (tiepTuc) {
            hienThiMenuCapDo();
            int capDo = scanner.nextInt();
            
            if (capDo == 0) {
                System.out.println("Cam on ban da su dung chuong trinh!");
                tiepTuc = false;
                continue;
            }
            
            switch (capDo) {
                case 1:
                    xuLyCapDo1(scanner);
                    break;
                case 2:
                    xuLyCapDo2(scanner);
                    break;
                case 3:
                    xuLyCapDo3(scanner);
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
            
            System.out.println("\n" + "=".repeat(50) + "\n");
        }
        
        scanner.close();
    }
    
    private static void hienThiMenuCapDo() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   CHUONG TRINH BAI TAP JAVA TESTER    ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("Chon cap do:");
        System.out.println("1. Cap do 1 (Co ban)");
        System.out.println("2. Cap do 2 (Trung binh)");
        System.out.println("3. Cap do 3 (Nang cao)");
        System.out.println("0. Thoat");
        System.out.print("Nhap lua chon cua ban: ");
    }
    
    private static void xuLyCapDo1(Scanner scanner) {
        System.out.println("\n--- CAP DO 1 ---");
        System.out.println("1. Xoa Nguyen Am Trong Chuoi");
        System.out.println("2. Tim Gia Tri Lon Thu Hai Trong Mang");
        System.out.println("3. Tinh Tong Cac So Chan");
        System.out.println("4. Dem So Tu Trong Chuoi");
        System.out.println("5. In Chu Cai Dau Moi Tu");
        System.out.print("Chon bai tap: ");
        
        int baiTap = scanner.nextInt();
        System.out.println();
        
        switch (baiTap) {
            case 1:
                XoaNguyenAmTrongChuoi.run();
                break;
            case 2:
                TimGiaTriLonThuHai.run();
                break;
            case 3:
                TinhTongCacSoChan.run();
                break;
            case 4:
                DemSoTuTrongChuoi.run();
                break;
            case 5:
                InChuCaiDauMoiTu.run();
                break;
            default:
                System.out.println("Bai tap khong ton tai!");
        }
    }
    
    private static void xuLyCapDo2(Scanner scanner) {
        System.out.println("\n--- CAP DO 2 ---");
        System.out.println("1. Tinh Thue Thu Nhap Ca Nhan");
        System.out.println("2. Kiem Tra Chuoi Doi Xung");
        System.out.println("3. Xoa Ky Tu Lap Lai Trong Chuoi");
        System.out.print("Chon bai tap: ");
        
        int baiTap = scanner.nextInt();
        System.out.println();
        
        switch (baiTap) {
            case 1:
                TinhThueThuNhapCaNhan.run();
                break;
            case 2:
                KiemTraChuoiDoiXung.run();
                break;
            case 3:
                XoaKyTuLapLai.run();
                break;
            default:
                System.out.println("Bai tap khong ton tai!");
        }
    }
    
    private static void xuLyCapDo3(Scanner scanner) {
        System.out.println("\n--- CAP DO 3 ---");
        System.out.println("1. Two Sum II - Input Array Is Sorted");
        System.out.println("2. Longest Palindromic Substring");
        System.out.println("3. Minimum Window Substring");
        System.out.print("Chon bai tap: ");
        
        int baiTap = scanner.nextInt();
        System.out.println();
        
        switch (baiTap) {
            case 1:
                TwoSumII.run();
                break;
            case 2:
                LongestPalindromicSubstring.run();
                break;
            case 3:
                MinimumWindowSubstring.run();
                break;
            default:
                System.out.println("Bai tap khong ton tai!");
        }
    }
}
