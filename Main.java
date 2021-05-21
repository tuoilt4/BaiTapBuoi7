import javax.script.ScriptContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bài tập cần kiểm tra: ");
        int o = sc.nextInt();
        switch (o) {
            case 1: {
                System.out.println("Bài tập mảng đa chiều");
                int n;
                int arra[][];
                System.out.print("Nhập số hàng, số cột của mảng: ");
                n = sc.nextInt();
                arra = new int[n][n];
                System.out.println("Nhập mảng A: ");
                BaiTapBuoi7_1.nhapmatran(arra, n);
                System.out.println("In ra mảng A: ");
                BaiTapBuoi7_1.inmatran(arra, n);
                BaiTapBuoi7_1.lkdchinh(arra, n);
                BaiTapBuoi7_1.congcheochinh(arra, n);
                System.out.println("In ma trận có dòng hai sắp xếp theo chiều tăng dần");
                BaiTapBuoi7_1.arrage(arra,n);
                break;
            }
            case 2: {
                System.out.println("Bài tập mảng một chiều");
                System.out.print("Nhập kích thước mảng: ");
                int n = sc.nextInt();
                int arr[] = new int[n];
                BaiTapBuoi7_2.nhapmang(arr, n);
                BaiTapBuoi7_2.inmang(arr,n);
                BaiTapBuoi7_2.timtinhtong(arr,n);
                BaiTapBuoi7_2.suaphantu(arr,n);
                break;
            }
            default:
                System.out.println("Không có bài tập này");
        }

    }
}