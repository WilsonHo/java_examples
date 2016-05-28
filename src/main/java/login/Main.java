package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by baohg on 5/28/16.
 */
public class Main {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("JDialog Demo");
        final JButton btnLogin = new JButton("Click to login");
        final JButton btnLogout = new JButton("Click to logout");

        btnLogin.setVisible(true);
        btnLogout.setVisible(false);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnLogin){
                    LoginDialog loginDlg = new LoginDialog(frame);
                    loginDlg.setVisible(true);
                    if (loginDlg.isSucceeded()) {
                        btnLogin.setVisible(false);
                        btnLogout.setVisible(true);
                    }
                }
                else if (e.getSource() == btnLogout){
                    btnLogin.setVisible(true);
                    btnLogout.setVisible(false);
                    LoginDialog loginDlg = new LoginDialog(frame);
                    loginDlg.setVisible(true);
                }
            }
        };
        btnLogin.addActionListener(listener);
        btnLogout.addActionListener(listener);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(btnLogin);
        frame.getContentPane().add(btnLogout);
        frame.setVisible(true);
    }
}
