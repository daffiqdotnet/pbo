/*
 *  Mata Kuliah : Program Berorientasi Objek
 *  Kelas : TK-1A.
 */

/**
 *
 * @author daffiqto
 */
import javax.swing.*;

public class TopUpEWallet extends javax.swing.JFrame {
    public TopUpEWallet() {
        setTitle("Top Up E-Wallet");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel ewalletLabel = new JLabel(ATMMainMenu.lang.getString("e_wallet"));
        ewalletLabel.setBounds(30, 30, 120, 25);
        JComboBox<String> ewalletBox = new JComboBox<>(new String[]{"ShopeePay", "Dana", "GoPay", "OVO"});
        ewalletBox.setBounds(150, 30, 150, 25);

        JLabel noLabel = new JLabel(ATMMainMenu.lang.getString("destination_number"));
        noLabel.setBounds(30, 70, 120, 25);
        JTextField noField = new JTextField();
        noField.setBounds(150, 70, 150, 25);

        JLabel namaLabel = new JLabel(ATMMainMenu.lang.getString("owner_name"));
        namaLabel.setBounds(30, 110, 120, 25);
        JTextField namaField = new JTextField();
        namaField.setBounds(150, 110, 150, 25);

        JLabel jumlahLabel = new JLabel("Jumlah:");
        jumlahLabel.setBounds(30, 150, 120, 25);
        JTextField jumlahField = new JTextField();
        jumlahField.setBounds(150, 150, 150, 25);

        JButton okButton = new JButton("Top Up");
        okButton.setBounds(50, 200, 100, 30);
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(180, 200, 100, 30);

        add(ewalletLabel); add(ewalletBox);
        add(noLabel); add(noField);
        add(namaLabel); add(namaField);
        add(jumlahLabel); add(jumlahField);
        add(okButton); add(cancelButton);

        okButton.addActionListener(e -> {
            try {
                int jumlah = Integer.parseInt(jumlahField.getText());
                if (ATMMainMenu.saldo < 50000 || jumlah > ATMMainMenu.saldo) {
                    JOptionPane.showMessageDialog(this, ATMMainMenu.lang.getString("insufficient"));
                } else {
                    ATMMainMenu.saldo -= jumlah;
                    JOptionPane.showMessageDialog(this,
                        ATMMainMenu.lang.getString("success") + "\n" +
                        ewalletBox.getSelectedItem() + " -> " + noField.getText() +
                        " a.n. " + namaField.getText());
                    dispose();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Input tidak valid!");
            }
        });

        cancelButton.addActionListener(e -> dispose());
    }
}