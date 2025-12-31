package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class About extends JFrame implements ActionListener {
    JButton b1;

    About() {
        setBounds(600, 200, 700, 600);
        setLayout(null);

        // Load windows.png
        URL windowsURL = getClass().getResource("/notepad/icons/windows.png");
        if (windowsURL != null) {
            ImageIcon i1 = new ImageIcon(windowsURL);
            Image i2 = i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
            JLabel l1 = new JLabel(new ImageIcon(i2));
            l1.setBounds(150, 40, 400, 80);
            add(l1);
        } else {
            System.out.println("windows.png not found");
        }

        // Load notepad.png
        URL notepadURL = getClass().getResource("/notepad/icons/notepad.png");
        if (notepadURL != null) {
            ImageIcon i4 = new ImageIcon(notepadURL);
            Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
            JLabel l2 = new JLabel(new ImageIcon(i5));
            l2.setBounds(50, 180, 70, 70);
            add(l2);
        } else {
            System.out.println("notepad.png not found");
        }

        JLabel l3 = new JLabel("<html><br>notepad project created by yash using programming language java<br><br>Notepad is a word processing program, <br>which allows changing of text in a computer file.<br>Notepad is a simple text editor for basic text-editing program<br> which enables computer users to create documents. </html>");
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l3.setBounds(150, 130, 500, 300);
        add(l3);

        b1 = new JButton("OK");
        b1.setBounds(580, 500, 80, 25);
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
