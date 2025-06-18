package test;                      // 🟢 Thêm dòng này ở đầu file
import logic.XuLyGame;

public class TestXuLyGame {
    public static void main(String[] args) {
        int soBiMat = 42;
        int soDoan = 30;
        System.out.println(XuLyGame.xuLyDoanSo(soDoan, soBiMat));
    }
}
