package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by baohg on 5/28/16.
 */
public class Main {
    JFrame t = new JFrame("Button Layout Demo");
    JPanel configurePanel = new JPanel();
    JPanel okCancelPanel = new JPanel();
    JPanel buttonPanel = new JPanel(new BorderLayout());


    private void createUIComponents() {
        configurePanel.add(new JButton("Configure"));
        okCancelPanel.add(new JButton("Ok"));
        okCancelPanel.add(new JButton("Cancel"));
        buttonPanel.add(configurePanel, BorderLayout.WEST);
        buttonPanel.add(okCancelPanel, BorderLayout.EAST);
        t.setContentPane(buttonPanel);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(400, 65);
        t.setVisible(true);
    }

    public static void main(String args[]) {
        Main m = new Main();
        m.createUIComponents();
    }
}
