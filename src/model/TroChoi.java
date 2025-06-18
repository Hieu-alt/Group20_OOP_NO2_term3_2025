import java.util.Random;

public class TroChoi {
    private int soBiMat;
    private final int soLanToiDa = 5;

    public TroChoi() {
        try {
            Random rand = new Random();
            soBiMat = rand.nextInt(100) + 1; // Sinh số từ 1 đến 100
        } catch (Exception e) {
            System.err.println("Lỗi khi tạo số bí mật: " + e.getMessage());
            soBiMat = 1; // Gán số mặc định để tránh lỗi sau
        } finally {
            System.out.println("Hoàn tất khởi tạo số bí mật.");
        }
    }

    public boolean kiemTraDoan(int so) {
        try {
            return so == soBiMat;
        } catch (Exception e) {
            System.err.println("Lỗi khi kiểm tra đoán số: " + e.getMessage());
            return false;
        } finally {
            System.out.println("Hoàn tất kiểm tra đoán.");
        }
    }

    public int getSoBiMat() {
        return soBiMat;
    }

    public int getSoLanToiDa() {
        return soLanToiDa;
    }
}
