package level3;

/*
 * Bài Tập: Two Sum II - Input Array Is Sorted
 * Mô tả: Cho một mảng đã được sắp xếp tăng dần và một số nguyên target,
 *        hãy tìm hai số trong mảng có tổng bằng target và trả về chỉ số (index) của chúng (bắt đầu từ 1).
 * Ví dụ:
 * - Input: numbers = [2,7,11,15], target = 9 -> Output: [1,2]
 */
public class TwoSumII {
    
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[]{-1, -1};
    }
    
    public static void run() {
        System.out.println("=== Two Sum II - Input Array Is Sorted ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Nhap cac phan tu (da sap xep tang dan):");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("Nhap target: ");
        int target = scanner.nextInt();
        
        int[] result = twoSum(numbers, target);
        if (result[0] == -1) {
            System.out.println("Khong tim thay cap so nao co tong bang " + target);
        } else {
            System.out.println("Vi tri: [" + result[0] + ", " + result[1] + "]");
        }
    }
}
