package test;

public class TroChoiTest {
    public static void main(String[] args) {
        TroChoi game = new TroChoi();
        
        int soBiMat = game.getSoBiMat();
        if (soBiMat < 1 || soBiMat > 100) {
            System.out.println("❌ Test thất bại: Số bí mật không nằm trong khoảng 1-100");
        } else {
            System.out.println("✅ Test 1 passed: Số bí mật trong khoảng hợp lệ");
        }

        boolean ketQuaDung = game.kiemTraDoan(soBiMat);
        System.out.println(ketQuaDung ? "✅ Test 2 passed: Đoán đúng" : "❌ Test 2 failed");

        boolean ketQuaSai = game.kiemTraDoan(soBiMat + 1);
        System.out.println(!ketQuaSai ? "✅ Test 3 passed: Đoán sai" : "❌ Test 3 failed");
    }
}
