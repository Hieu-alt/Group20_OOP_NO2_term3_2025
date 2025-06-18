import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TroChoiGUI extends JFrame {
    private int soBiMat;
    private int soLanToiDa = 5;
    private int soLanDoan = 0;

    private JTextField tenField;
    private JTextField doanField;
    private JLabel ketQuaLabel;
    private JLabel luotConLaiLabel;

    public TroChoiGUI() {
        setTitle("🎯 Trò chơi đoán số");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa

        // Giao diện
        JPanel panel = new JPanel(new GridLayout(6, 1, 10, 10));
        add(panel);

        tenField = new JTextField();
        doanField = new JTextField();
        ketQuaLabel = new JLabel(" ", SwingConstants.CENTER);
        luotConLaiLabel = new JLabel("Bạn có " + soLanToiDa + " lượt đoán.", SwingConstants.CENTER);

        JButton doanButton = new JButton("Đoán!");

        panel.add(new JLabel("Nhập tên bạn:", SwingConstants.CENTER));
        panel.add(tenField);
        panel.add(new JLabel("Nhập số (1 - 100):", SwingConstants.CENTER));
        panel.add(doanField);
        panel.add(doanButton);
        panel.add(ketQuaLabel);
        panel.add(luotConLaiLabel);

        khoiTaoSoBiMat();

        doanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doDoan();
            }
        });
    }

    private void khoiTaoSoBiMat() {
    try {
        Random rand = new Random();
        soBiMat = rand.nextInt(100) + 1;
    } catch (Exception e) {
        System.err.println("Lỗi khi khởi tạo số bí mật: " + e.getMessage());
        soBiMat = 1; // gán mặc định để tránh null
    } finally {
        System.out.println("Đã tạo số bí mật.");
    }
}


    private void doDoan() {
    String ten = tenField.getText().trim();
    if (ten.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập tên!", "Thiếu tên", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String soNhap = doanField.getText().trim();
    int so;
    try {
        so = Integer.parseInt(soNhap);
    } catch (NumberFormatException e) {
        ketQuaLabel.setText("Vui lòng nhập một số hợp lệ!");
        return;
    }

    try {
        soLanDoan++;
        int luotCon = soLanToiDa - soLanDoan;

        if (so == soBiMat) {
            ketQuaLabel.setText("🎉 Đúng rồi! Chúc mừng, " + ten + "!");
            doanField.setEnabled(false);
        } else if (so < soBiMat) {
            ketQuaLabel.setText("Số bạn đoán nhỏ hơn.");
        } else {
            ketQuaLabel.setText("Số bạn đoán lớn hơn.");
        }

        luotConLaiLabel.setText("Còn " + luotCon + " lượt.");

        if (soLanDoan >= soLanToiDa && so != soBiMat) {
            ketQuaLabel.setText("😢 Hết lượt! Số đúng là: " + soBiMat);
            doanField.setEnabled(false);
        }
    } catch (Exception e) {
        ketQuaLabel.setText("Đã xảy ra lỗi khi xử lý đoán số.");
        System.err.println("Lỗi xử lý đoán số: " + e.getMessage());
    } finally {
        System.out.println("Đã xử lý xong một lần đoán.");
    }
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TroChoiGUI().setVisible(true);
        });
    }
}
