import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        // Sử dụng Locale.US để nhập số thực bằng dấu chấm (2.4) không bị lỗi
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<Double> dsDiem = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n******************QUẢN LÝ ĐIỂM SV******************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình của các sinh viên");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            chon = input.nextInt();

            switch (chon) {
                case 1:
                    System.out.print("Nhập số lượng SV muốn thêm: ");
                    int n = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập điểm SV thứ " + (dsDiem.size() + 1) + ": ");
                        dsDiem.add(input.nextDouble());
                    }
                    break;

                case 2:
                    System.out.println("Danh sách điểm: " + dsDiem);
                    break;

                case 3:
                    if (dsDiem.isEmpty()) break;
                    double sum = 0;
                    for (double d : dsDiem) sum += d;
                    System.out.printf("Điểm trung bình: %.2f\n", (sum / dsDiem.size()));
                    break;

                case 4:
                    if (dsDiem.isEmpty()) break;
                    System.out.println("Điểm cao nhất: " + Collections.max(dsDiem));
                    System.out.println("Điểm thấp nhất: " + Collections.min(dsDiem));
                    break;

                case 5:
                    int dat = 0, truot = 0;
                    for (double d : dsDiem) {
                        if (d >= 5) dat++; else truot++;
                    }
                    System.out.println("Số SV đạt: " + dat);
                    System.out.println("Số SV trượt: " + truot);
                    break;

                case 6:
                    Collections.sort(dsDiem);
                    System.out.println("Đã sắp xếp tăng dần: " + dsDiem);
                    break;

                case 7:
                    int gioi = 0;
                    for (double d : dsDiem) if (d >= 8) gioi++;
                    System.out.println("Số SV giỏi và xuất sắc: " + gioi);
                    break;

                case 8:
                    System.out.println("Đã thoát!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 8);
    }
}