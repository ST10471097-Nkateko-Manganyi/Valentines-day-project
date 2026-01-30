/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vcconnect.praiseproject;

/**
 *
 * @author nkatekomanganyi
 */
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nkatekomanganyi
 */
public class CustomFrame extends JFrame implements ActionListener {

    JTextField nameField = new JTextField(12);
    JLabel displayText = new JLabel();
    

    JButton button1 = new JButton("Yes of course 😝");
    JButton button2 = new JButton("NO 👎🏾");

    public CustomFrame() {
        setSize(350, 500);
        setTitle("Valentines day proposal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 16);

        JLabel namePrompt = new JLabel("Enter your name");

        JLabel heading = new JLabel("Will you be my valentine?🥹");
        heading.setFont(font);

        setLayout(new FlowLayout());

        add(heading);
        add(namePrompt);
        add(nameField);
        add(button1);
        add(button2);
        add(displayText);

        button1.addActionListener(this);
        button2.addActionListener(this);
        nameField.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText().trim();

        if (name.isEmpty() || !name.equalsIgnoreCase("Praise")) {
            JOptionPane.showMessageDialog(this, "Oh ya, you can only be my valentine if you're Praise🙃");
            return;
        }

        if (e.getSource() == button1) {
            displayText.setText("Yayyyyy!!!!😝");
        }

        if (e.getSource() == button2) {
            displayText.setText("Hayi, since you're " + name + " you'll be my valentine anyways🙃");
        }
    }

}
