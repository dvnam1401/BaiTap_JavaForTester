# Bài Tập Java For Tester

Dự án tổng hợp các bài tập lập trình Java được phân chia theo 3 cấp độ: Cơ bản, Trung bình và Nâng cao.

## Cấu trúc dự án

```
BaiTap_JavaForTester/
├── src/
│   ├── Main.java                          # Menu chính để chọn cấp độ và bài tập
│   ├── level1/                            # Cấp độ 1 - Cơ bản
│   │   ├── XoaNguyenAmTrongChuoi.java
│   │   ├── TimGiaTriLonThuHai.java
│   │   ├── TinhTongCacSoChan.java
│   │   ├── DemSoTuTrongChuoi.java
│   │   └── InChuCaiDauMoiTu.java
│   ├── level2/                            # Cấp độ 2 - Trung bình
│   │   ├── TinhThueThuNhapCaNhan.java
│   │   ├── KiemTraChuoiDoiXung.java
│   │   └── XoaKyTuLapLai.java
│   └── level3/                            # Cấp độ 3 - Nâng cao
│       ├── TwoSumII.java
│       ├── LongestPalindromicSubstring.java
│       └── MinimumWindowSubstring.java
├── out/                                   # Thư mục chứa file .class sau khi compile
├── compile.bat                            # Script compile code
└── run.bat                                # Script chạy chương trình
```

## Yêu cầu hệ thống

- Java Development Kit (JDK) 21
- Hệ điều hành: Windows/Linux/MacOS

## Cài đặt và chạy

### Sử dụng command line

1. Compile code:
```bash
javac -d out src/Main.java src/level1/*.java src/level2/*.java src/level3/*.java
```

2. Chạy chương trình:
```bash
java -cp out Main
```

### Cách 3: Sử dụng Java 21 cụ thể (nếu có nhiều phiên bản Java)

1. Compile:
```bash
"C:\Program Files\Java\jdk-21\bin\javac.exe" -d out src/Main.java src/level1/*.java src/level2/*.java src/level3/*.java
```

2. Chạy:
```bash
"C:\Program Files\Java\jdk-21\bin\java.exe" -cp out Main
```

## Danh sách bài tập

### Cấp độ 1 - Cơ bản

1. **Xóa Nguyên Âm Trong Chuỗi**: Xóa tất cả các nguyên âm (a, e, i, o, u) trong chuỗi
2. **Tìm Giá Trị Lớn Thứ Hai**: Tìm số lớn thứ hai trong mảng số nguyên
3. **Tính Tổng Các Số Chẵn**: Tính tổng các số chẵn từ 0 đến n
4. **Đếm Số Từ Trong Chuỗi**: Đếm số lượng từ trong một chuỗi
5. **In Chữ Cái Đầu Mỗi Từ**: Lấy chữ cái đầu tiên của mỗi từ trong chuỗi

### Cấp độ 2 - Trung bình

1. **Tính Thuế Thu Nhập Cá Nhân**: Tính thuế theo bậc lũy tiến từng phần
2. **Kiểm Tra Chuỗi Đối Xứng**: Kiểm tra chuỗi có phải palindrome không
3. **Xóa Ký Tự Lặp Lại**: Xóa các ký tự trùng lặp, chỉ giữ lại ký tự đầu tiên

### Cấp độ 3 - Nâng cao

1. **Two Sum II**: Tìm hai số trong mảng đã sắp xếp có tổng bằng target
2. **Longest Palindromic Substring**: Tìm chuỗi con đối xứng dài nhất
3. **Minimum Window Substring**: Tìm chuỗi con nhỏ nhất chứa tất cả ký tự của chuỗi t

## Tính năng

- Menu tương tác thân thiện
- Cho phép người dùng nhập input tùy chỉnh
- Code sử dụng Java core cơ bản, không dùng thư viện ngoài
- Mỗi bài tập có comment mô tả chi tiết bằng tiếng Việt

## Tác giả

Dự án bài tập Java For Tester
