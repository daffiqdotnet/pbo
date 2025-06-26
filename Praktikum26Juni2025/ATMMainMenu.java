/*
 *  Mata Kuliah : Program Berorientasi Objek
 *  Kelas : TK-1A.
 */

/**
 *
 * @author daffiqto
 */
import javax.swing.*;
import java.util.ResourceBundle;

public class ATMMainMenu extends JFrame {
    public static int saldo = 500000;
    public static ResourceBundle lang;

    public ATMMainMenu() {
        setTitle("ATM - Menu Utama");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton cekSaldo = new JButton(lang.getString("check_balance"));
        JButton tarikTunai = new JButton(lang.getString("withdraw"));
        JButton transfer = new JButton(lang.getString("transfer"));
        JButton topup = new JButton(lang.getString("topup"));
        JButton logout = new JButton(lang.getString("logout"));

        cekSaldo.setBounds(80, 30, 120, 30);
        tarikTunai.setBounds(80, 70, 120, 30);
        transfer.setBounds(80, 110, 120, 30);
        topup.setBounds(80, 150, 120, 30);
        logout.setBounds(80, 190, 120, 30);

        add(cekSaldo);
        add(tarikTunai);
        add(transfer);
        add(topup);
        add(logout);

        cekSaldo.addActionListener(e -> new CekSaldo().setVisible(true));
        tarikTunai.addActionListener(e -> new TarikTunai().setVisible(true));
        transfer.addActionListener(e -> new Transfer().setVisible(true));
        topup.addActionListener(e -> new TopUpEWallet().setVisible(true));
        logout.addActionListener(e -> {
            new ATMLoginForm().setVisible(true);
            dispose();
        });
    }
}