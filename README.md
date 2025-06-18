# Group20_OOP_NO2_term3_2025
# 🎮 Game Đoán Số
Practice 2:

Câu 1: Tiêu đề: "Game Đoán Số"

---

Câu 2:

* NguoiChoi
- `ten: String` – tên người chơi
- `soLanDoan: int` – số lượt đoán
- `doanSo(int so)` – thực hiện đoán số

* TroChoi
- `soBiMat: int` – số ngẫu nhiên hệ thống sinh ra
- `soLanToiDa: int = 5` – giới hạn lượt đoán
- `kiemTraDoan(int so)` – kiểm tra đoán đúng/sai

* QuanLiTroChoi
- `nguoiChoi: NguoiChoi`
- `troChoi: TroChoi`
- `choiGame()` – điều khiển toàn bộ quá trình chơi

---

### Link Repo: https://github.com/Hieu-alt/Group20_OOP_NO2_term3_2025
### Link README: https://github.com/Hieu-alt/Group20_OOP_NO2_term3_2025/edit/main/README.md

---

Practice 4:

Nội dung 01: Xây dựng ứng dụng quản lý trò chơi đoán số

Giao diện: Java console (tối thiểu), có thể nâng cấp lên Spring Boot giao diện web nếu mở rộng.

Chức năng quản lý:

Thêm, sửa, xóa NguoiChoi

Thêm, sửa, xóa TroChoi

Liệt kê danh sách LuotChoi, lọc theo người chơi hoặc kết quả

Gán NguoiChoi cho TroChoi

Dữ liệu lưu bằng file nhị phân (.dat)

Dữ liệu trong RAM dùng Collection: ArrayList, Map, v.v.

---

Nội dung 02: Class Diagram

Đã thiết kế sơ đồ lớp bao gồm:

NguoiChoi

TroChoi

LuotChoi

CrudService<T>

FileStorage

---

Nội dung 03: Behavioural Diagrams

Sequence Diagram: mô tả quy trình đoán số từ nhập -> xử lý -> kết quả

Activity Diagram: mô tả các bước xử lý của một lượt chơi

---

Nội dung 04:

CRUD đã viết cho 3 đối tượng chính

Dùng CrudService<T> để tái sử dụng

Kiểm thử đầy đủ trong class QuanLyTroChoi

Cập nhật tài liệu kiểm thử và hướng dẫn sử dụng vào README/Wiki

---

Practice 5: 
Nội dung 1: 03 phương thức hoạt động chính của hệ thống "Game Đoán Số"
- 1. Hiển thị tất cả lượt chơi của một người chơi
Trong class QuanLyTroChoi

Duyệt toàn bộ danh sách trò chơi và in ra lượt chơi của người chơi nhập từ bàn phím

- 2. Tìm kiếm người chơi theo tên (sử dụng stream)
Trong class QuanLyTroChoi

Duyệt danh sách NguoiChoi trong tất cả TroChoi, lọc bằng stream().filter(...)

- 3. Thêm lượt chơi mới
Trong class TroChoi và được sử dụng trong QuanLyTroChoi

Lấy tên người chơi, số đoán → tạo LuotChoi mới → thêm vào TroChoi

---
Nội dung 2:
![image](https://github.com/user-attachments/assets/86975c3f-7a10-44de-898a-6f0e70b67bdd)


---
Nội dung 3:
https://github.com/Hieu-alt/Group20_OOP_NO2_term3_2025
