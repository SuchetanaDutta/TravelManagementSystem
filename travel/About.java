package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{

    About()  {
        setBounds(600, 200, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200, 10, 100, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);

        String s = "About Projects               \n"  +
        "   \n"  +
        "The objective of the Travel and Tourise Management System project is to develop a system that       \n" +
        "\n"  +
        "This application will help in accessing the information related to the travel to the particuler    \n"  +
        "\n"   +
        "Advantage of Project: \n" +
        ".Gives accurate information\n"  +
        ".Simplifies the manual work\n"  +
        ".It minimizes the documentation related work\n"  +
        ".Provides up to date information\n"  +
        ".Friendly Environment by providing warning mesages. \n"  +
        ".travelers details can be provided\n"  +
        ".booking confirmation notification";

        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);

        JButton back = new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)  {
        setVisible(false);
    }
  
    public static void main(String[] args)  {
        new About();
    }
}

