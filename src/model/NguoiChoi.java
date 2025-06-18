public class NguoiChoi {
    private String ten;
    private int soLanDoan;

    public NguoiChoi(String ten) {
        this.ten = ten;
        this.soLanDoan = 0;
    }

    public void doanSo() {
    try {
        soLanDoan++;
    } catch (Exception e) {
        System.err.println("Lỗi khi tăng số lần đoán: " + e.getMessage());
    } finally {
        System.out.println("Đã xử lý phương thức doanSo().");
    }
}


    public int getSoLanDoan() {
        return soLanDoan;
    }

    public String getTen() {
        return ten;
    }
}
