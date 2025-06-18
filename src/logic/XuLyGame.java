package logic;

public class XuLyGame {
    public static String xuLyDoanSo(int soDoan, int soBiMat) {
        try {
            if (soDoan == soBiMat) {
                return "🎉 Đoán đúng! Bạn thắng.";
            } else if (soDoan < soBiMat) {
                return "❌ Số bạn đoán nhỏ hơn số bí mật.";
            } else {
                return "❌ Số bạn đoán lớn hơn số bí mật.";
            }
        } catch (Exception e) {
            System.err.println("Lỗi khi xử lý đoán số: " + e.getMessage());
            return "⚠️ Đã xảy ra lỗi khi xử lý đoán số.";
        } finally {
            System.out.println("Hoàn tất xử lý đoán số.");
        }
    }
}
