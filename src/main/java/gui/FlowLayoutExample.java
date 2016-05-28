package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by baohg on 5/28/16.
 */
public class FlowLayoutExample extends JFrame {


    public FlowLayoutExample() {

        initUI();
    }

    public final void initUI() {

        JPanel panel = new JPanel();

        JTextArea area = new JTextArea("text area");
        area.setPreferredSize(new Dimension(100, 100));

        JButton button = new JButton("button");
        panel.add(button);
        JTree tree = new JTree();
        panel.add(tree);
        panel.add(area);
        this.add(panel);
        pack();

        setTitle("FlowLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                FlowLayoutExample ex = new FlowLayoutExample();
                ex.setVisible(true);
            }
        });
    }
}
