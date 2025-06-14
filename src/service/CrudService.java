import java.util.ArrayList;
import java.util.List;

public class CrudService<T> {
    private List<T> danhSach;

    public CrudService() {
        danhSach = new ArrayList<>();
    }

    // Thêm
    public void them(T doiTuong) {
        danhSach.add(doiTuong);
    }

    // Lấy danh sách
    public List<T> layDanhSach() {
        return danhSach;
    }

    // Sửa (theo index)
    public void sua(int index, T doiTuongMoi) {
        if (index >= 0 && index < danhSach.size()) {
            danhSach.set(index, doiTuongMoi);
        } else {
            System.out.println("❌ Không tìm thấy đối tượng cần sửa!");
        }
    }

    // Xóa (theo index)
    public void xoa(int index) {
        if (index >= 0 && index < danhSach.size()) {
            danhSach.remove(index);
        } else {
            System.out.println("❌ Không tìm thấy đối tượng cần xóa!");
        }
    }

    // Tìm kiếm (theo chuỗi - yêu cầu ghi đè toString ở class gốc)
    public List<T> timKiem(String tuKhoa) {
        List<T> ketQua = new ArrayList<>();
        for (T doiTuong : danhSach) {
            if (doiTuong.toString().toLowerCase().contains(tuKhoa.toLowerCase())) {
                ketQua.add(doiTuong);
            }
        }
        return ketQua;
    }
}
