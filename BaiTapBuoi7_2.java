import java.util.Scanner;
public class BaiTapBuoi7_2 {

    // Nhập mảng số nguyên
    public static void nhapmang(int mangsn[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng số nguyên: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            mangsn[i] = sc.nextInt();
        }
    }

    // In ra thông tin mang
    public static void inmang(int mangsn[], int n) {
        System.out.print("In mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mangsn[i] + "\t");
        }
    }

    public static boolean ktsnt(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void timtinhtong(int mangsn[], int n) {
        int tong = 0;
        System.out.print("\nCác số nguyên tố trong mảng: ");
        for (int i = 0; i < n; i++) {
            if (ktsnt(mangsn[i])) {
                System.out.print(mangsn[i] + "\t");
                tong = tong + mangsn[i];
            }
        }
        System.out.print("\nTổng các số nguyên tố trong mảng: " + tong);
    }

    public static void suaphantu(int mangsn[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập vị trí cần sửa đổi trong mảng: ");
        int k = sc.nextInt();
        if (k < n) {
            System.out.println("Nhập số cần sửa tại vị trí " + k + " ");
            int h = sc.nextInt();
            mangsn[k] = h;
            inmang(mangsn, n);
        } else
        {
        System.out.println("Mảng không có vị trí " + k+" để sửa"); }
    }
}

