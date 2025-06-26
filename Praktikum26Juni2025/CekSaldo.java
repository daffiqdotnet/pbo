/*
 *  Mata Kuliah : Program Berorientasi Objek
 *  Kelas : TK-1A.
 */

/**
 *
 * @author daffiqto
 */
import javax.swing.*;

public class CekSaldo extends JFrame {
    public CekSaldo() {
        setTitle(ATMMainMenu.lang.getString("check_balance"));
        setSize(300, 150);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel label = new JLabel(ATMMainMenu.lang.getString("check_balance") + ": Rp " + ATMMainMenu.saldo);
        label.setBounds(40, 40, 220, 30);
        add(label);
    }
}
