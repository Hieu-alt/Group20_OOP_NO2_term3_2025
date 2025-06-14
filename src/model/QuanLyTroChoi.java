import java.util.Scanner;

public class QuanLyTroChoi {
    public void choiGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên người chơi: ");
        NguoiChoi nguoiChoi = new NguoiChoi(sc.nextLine());
        TroChoi troChoi = new TroChoi();

        System.out.println("Xin chào " + nguoiChoi.getTen() + "! Hãy đoán số từ 1 đến 100.");
        System.out.println("Bạn có " + troChoi.getSoLanToiDa() + " lượt đoán.");

        for (int i = 0; i < troChoi.getSoLanToiDa(); i++) {
            System.out.print("Lần " + (i + 1) + ": ");
            int so = sc.nextInt();
            nguoiChoi.doanSo();

            if (troChoi.kiemTraDoan(so)) {
                System.out.println("🎉 Đoán đúng! Bạn thắng.");
                System.out.println("Số lần đoán: " + nguoiChoi.getSoLanDoan());
                return;
            } else if (so < troChoi.getSoBiMat()) {
                System.out.println("Số bạn đoán nhỏ hơn số bí mật.");
            } else {
                System.out.println("Số bạn đoán lớn hơn số bí mật.");
            }
        }

        System.out.println("❌ Bạn đã hết lượt đoán.");
        System.out.println("Số đúng là: " + troChoi.getSoBiMat());
        System.out.println("Tổng số lần đoán: " + nguoiChoi.getSoLanDoan());
        sc.close();
    }
}
