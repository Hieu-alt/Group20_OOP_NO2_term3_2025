package test;

import logic.XuLyGame;

public class TestXuLyGame {
    public static void main(String[] args) {
        int soBiMat = 42;
        int soDoan = 30;

        try {
            System.out.println(XuLyGame.xuLyDoanSo(soDoan, soBiMat));  // ✅ Đúng tên phương thức
        } catch (Exception e) {
            System.out.println("❌ Lỗi: " + e.getMessage());
        } finally {
            System.out.println("✅ Đã kiểm tra đoán số.");
        }
    }
}
