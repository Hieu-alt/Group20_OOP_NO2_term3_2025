public class NguoiChoi {
    private String ten;
    private int soLanDoan;

    public NguoiChoi(String ten) {
        this.ten = ten;
        this.soLanDoan = 0;
    }

    public void doanSo() {
        soLanDoan++;
    }

    public int getSoLanDoan() {
        return soLanDoan;
    }

    public String getTen() {
        return ten;
    }
}
