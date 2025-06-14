import java.util.Random;

public class TroChoi {
    private int soBiMat;
    private final int soLanToiDa = 5;

    public TroChoi() {
        Random rand = new Random();
        soBiMat = rand.nextInt(100) + 1; // Sinh số từ 1 đến 100
    }

    public boolean kiemTraDoan(int so) {
        return so == soBiMat;
    }

    public int getSoBiMat() {
        return soBiMat;
    }

    public int getSoLanToiDa() {
        return soLanToiDa;
    }
}
