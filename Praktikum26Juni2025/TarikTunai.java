/*
 *  Mata Kuliah : Program Berorientasi Objek
 *  Kelas : TK-1A.
 */

/**
 *
 * @author daffiqto
 */
import javax.swing.*;

public class TarikTunai extends JFrame {
    public TarikTunai() {
        setTitle(ATMMainMenu.lang.getString("withdraw"));
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel label = new JLabel("Jumlah:");
        label.setBounds(30, 30, 100, 25);
        JTextField jumlahField = new JTextField();
        jumlahField.setBounds(110, 30, 130, 25);

        JButton tarik = new JButton(ATMMainMenu.lang.getString("withdraw"));
        tarik.setBounds(40, 80, 90, 30);
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(150, 80, 90, 30);

        add(label);
        add(jumlahField);
        add(tarik);
        add(cancel);

        tarik.addActionListener(e -> {
            try {
                int jumlah = Integer.parseInt(jumlahField.getText());
                if (ATMMainMenu.saldo < 50000 || jumlah > ATMMainMenu.saldo) {
                    JOptionPane.showMessageDialog(this, ATMMainMenu.lang.getString("insufficient"));
                } else {
                    ATMMainMenu.saldo -= jumlah;
                    JOptionPane.showMessageDialog(this,
                        ATMMainMenu.lang.getString("success") + "\nSisa saldo: Rp " + ATMMainMenu.saldo);
                    dispose();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Input tidak valid!");
            }
        });

        cancel.addActionListener(e -> dispose());
    }
}
