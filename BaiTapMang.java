import java.util.Scanner;

public class BaiTapMang {
    public static void main(String[] args) {
        //nhập vào số lượng , nhập vào số phần tử
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so luong phan tu: ");
        int soLuong = sc.nextInt();
        int[] arr = new int[soLuong];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap vao phan tu thu : " + i);
            arr[i] = sc.nextInt();
        }
        inMang(arr);
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                tong += arr[i];
            }
        }
        System.out.println("\ntong chan la :"+ tong);
        //
        System.out.println("nhap vao so can tim: ");
        int soCanTim=sc.nextInt();
        System.out.println("vi tri trong mang la: "+timViTriPhanTu(arr,soCanTim));
        System.out.println("Nhập vào số cần xoá: ");
        int soCanXoa = sc.nextInt();
        int viTriCanXoa = timViTriPhanTu(arr, soCanXoa);
        int[] newArr = new int[arr.length-1];
        for (int i=0; i<viTriCanXoa; i++) {
            newArr[i] = arr[i];
        }
        for (int i=viTriCanXoa; i<arr.length-1; i++) {
            newArr[i] = arr[i+1];
        }
        arr = newArr;
        inMang(arr);
    }
    static int timViTriPhanTu(int[] mang, int soCanTim) {
        int viTri = -1;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == soCanTim) {
                viTri = i;
            }
        }
        return viTri;
    }
    static void inMang(int[] mang) {
        System.out.println("Mảng là: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i]+"\t");
        }
    }
}
