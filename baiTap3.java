import java.util.Scanner;

public class baiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soLuong;

        System.out.println("Nhap phan tu vao mang :");
        soLuong = sc.nextInt();
        int[]a = new int[soLuong];
        int sum= 0;
        for (int i = 0; i < soLuong; i++) {
            if (a[i] % 2 == 0) {
                sum = (int) (sum + a[i]);
            }
        }
        System.out.println("Tong chan la:" + sum);
    }
}
