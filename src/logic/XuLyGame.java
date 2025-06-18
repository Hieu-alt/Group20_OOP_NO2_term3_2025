package logic;

public class XuLyGame {
    public static String xuLyDoanSo(int soDoan, int soBiMat) {
        if (soDoan == soBiMat) {
            return "🎉 Đoán đúng! Bạn thắng.";
        } else if (soDoan < soBiMat) {
            return "❌ Số bạn đoán nhỏ hơn số bí mật.";
        } else {
            return "❌ Số bạn đoán lớn hơn số bí mật.";
        }
    }
}
