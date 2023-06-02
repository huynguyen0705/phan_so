import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        QuanLyPs quanLyPs = new QuanLyPs();
        while (isRunning){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập vào 1 phân số");
                System.out.println("Nhập tử số: ");
                int tuSo = sc.nextInt();
                System.out.println("Nhập mẫu số: ");
                int mauSo = sc.nextInt();
                quanLyPs.NhapPhanSo(tuSo, mauSo);
                System.out.println("Nhập lựa chọn");
                System.out.println("1. Hiển thị phân số vừa nhập");
                System.out.println("2. Cộng hai phân số");
                System.out.println("3. thoát");
                int input = sc.nextInt();
                if (input < 1 || input > 3){
                    System.out.println("Nhập sai");
                }
                switch (input){
                    case 1:
                        quanLyPs.HienThi();
                        break;
                    case 2:
                        System.out.println("CỘNG 2 PHÂN SỐ");
                        System.out.println("Nhập tử số ps mới: ");
                        Scanner sc1 = new Scanner(System.in);
                        int tuSo2 = sc1.nextInt();
                        System.out.println("Nhập mẫu số ps mới: ");
                        Scanner sc2 = new Scanner(System.in);
                        int mauSo2 = sc2.nextInt();
                        quanLyPs.Cong2PhanSo(new PhanSo(tuSo2, mauSo2));
                        break;
                    case 3:
                        isRunning = false;
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("nhập sai tham số đầu vào");
            }
        }
    }
}