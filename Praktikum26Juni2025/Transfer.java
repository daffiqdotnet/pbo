/*
 *  Mata Kuliah : Program Berorientasi Objek
 *  Kelas : TK-1A.
 */

/**
 *
 * @author daffiqto
 */
import javax.swing.*;

public class Transfer extends JFrame {
    public Transfer() {
        setTitle(ATMMainMenu.lang.getString("transfer"));
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel tujuanLabel = new JLabel(ATMMainMenu.lang.getString("destination_number"));
        tujuanLabel.setBounds(30, 30, 120, 25);
        JTextField tujuanField = new JTextField();
        tujuanField.setBounds(150, 30, 150, 25);

        JLabel jumlahLabel = new JLabel("Jumlah:");
        jumlahLabel.setBounds(30, 70, 120, 25);
        JTextField jumlahField = new JTextField();
        jumlahField.setBounds(150, 70, 150, 25);

        JButton transferBtn = new JButton(ATMMainMenu.lang.getString("transfer"));
        transferBtn.setBounds(50, 120, 100, 30);
        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(170, 120, 100, 30);

        add(tujuanLabel);
        add(tujuanField);
        add(jumlahLabel);
        add(jumlahField);
        add(transferBtn);
        add(cancelBtn);

        transferBtn.addActionListener(e -> {
            try {
                int jumlah = Integer.parseInt(jumlahField.getText());
                if (ATMMainMenu.saldo < 50000 || jumlah > ATMMainMenu.saldo) {
                    JOptionPane.showMessageDialog(this, ATMMainMenu.lang.getString("insufficient"));
                } else {
                    ATMMainMenu.saldo -= jumlah;
                    JOptionPane.showMessageDialog(this,
                        ATMMainMenu.lang.getString("success") + "\nTransfer ke: " + tujuanField.getText() +
                        "\nSisa saldo: Rp " + ATMMainMenu.saldo);
                    dispose();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Input tidak valid!");
            }
        });

        cancelBtn.addActionListener(e -> dispose());
    }
}
