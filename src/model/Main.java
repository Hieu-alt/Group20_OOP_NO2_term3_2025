public class Main {
    public static void main(String[] args) {
        try {
            QuanLyTroChoi qltc = new QuanLyTroChoi();
            qltc.choiGame();
        } catch (Exception e) {
            System.err.println("Lỗi trong chương trình chính: " + e.getMessage());
        } finally {
            System.out.println("Chương trình kết thúc.");
        }
    }
}
