package level1;

/*
 * Bài Tập: Tìm Giá Trị Lớn Thứ Hai Trong Mảng
 * Mô tả: Viết một hàm để tìm giá trị lớn thứ hai trong một mảng số nguyên.
 * Yêu cầu:
 * - Hàm sẽ nhận vào một mảng số nguyên và trả về giá trị lớn thứ hai trong mảng
 * - Nếu mảng có ít hơn hai phần tử, trả về Integer.MIN_VALUE
 * Ví dụ:
 * - Input: [1, 3, 4, 5, 0, 2] -> Output: 4
 * - Input: [10, 5, 10] -> Output: 5
 * - Input: [3] -> Output: Integer.MIN_VALUE
 */
public class TimGiaTriLonThuHai {
    
    public static int timLonThuHai(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        
        return secondMax == Integer.MIN_VALUE ? Integer.MIN_VALUE : secondMax;
    }
    
    public static void run() {
        System.out.println("=== Tim Gia Tri Lon Thu Hai ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        int result = timLonThuHai(arr);
        if (result == Integer.MIN_VALUE) {
            System.out.println("Ket qua: Khong tim thay gia tri lon thu hai");
        } else {
            System.out.println("Ket qua: " + result);
        }
    }
}
