/*
 *  Mata Kuliah : Program Berorientasi Objek
 *  Kelas : TK-1A.
 */

/**
 *
 * @author daffiqto
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class ATMLoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, exitButton;
    private JComboBox<String> languageBox;

    public ATMLoginForm() {
        setTitle("ATM - Login");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel langLabel = new JLabel("Bahasa / Language:");
        langLabel.setBounds(20, 10, 140, 25);
        add(langLabel);

        languageBox = new JComboBox<>(new String[]{"Indonesia", "English"});
        languageBox.setBounds(160, 10, 130, 25);
        add(languageBox);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 50, 80, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(110, 50, 180, 25);
        add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 90, 80, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(110, 90, 180, 25);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(60, 140, 100, 30);
        add(loginButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(180, 140, 100, 30);
        add(exitButton);

        loginButton.addActionListener(e -> login());
        exitButton.addActionListener(e -> System.exit(0));
    }

    private void login() {
        String user = usernameField.getText();
        String pass = new String(passwordField.getPassword());
        String selectedLanguage = (String) languageBox.getSelectedItem();

        Locale locale = selectedLanguage.equals("English") ? new Locale("en", "US") : new Locale("id", "ID");
        ResourceBundle bundle = ResourceBundle.getBundle("lang", locale);

        if(user.equals("daffiqtrie") && pass.equals("2401083003")) {
            ATMMainMenu.lang = bundle;
            new ATMMainMenu().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, bundle.getString("login_failed"));
        }
    }

    public static void main(String[] args) {
        new ATMLoginForm().setVisible(true);
    }
}