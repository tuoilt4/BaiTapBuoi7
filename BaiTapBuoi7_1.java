import java.util.Scanner;
public class BaiTapBuoi7_1 {
    public static void nhapmatran(int arr[][], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ " + i + j + " của mảng: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void inmatran(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void lkdchinh(int arr[][], int n) {
        System.out.println("In đường chéo chính của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {System.out.print(arr[i][j] + "\t");}
            }
        }
    }
    public static void congcheochinh(int arr[][], int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {tong = tong +arr[i][j];}
            }
        }
        System.out.println("\nTổng của đường chéo chính của ma trận: " +tong);
    }
    public static void arrage (int arr[][], int n) {
        if (n < 2) {
            System.out.println("Không sắp được do mảng chỉ có một hàng");
        } else {
            int temp = arr[1][0];
            for (int i = 1; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i][j] > arr[i][k]) {
                            temp = arr[i][j];
                            arr[i][j] = arr[i][k];
                            arr[i][k] = temp;
                        }
                    }
                }
            }
            inmatran(arr,n);
        }
    }
}
