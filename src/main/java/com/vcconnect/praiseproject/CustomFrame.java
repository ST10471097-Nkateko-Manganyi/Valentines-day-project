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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CustomFrame extends JFrame implements ActionListener {

    // Enter your name panel
    JPanel namePanel = new JPanel();
    JTextField nameField = new JTextField(12);
    JButton btnContinue = new JButton("Continue");

    //Question Panle
    JPanel questionPanel = new JPanel();
    JLabel valentineLabel = new JLabel("Will you be my Valentine? 💕");
    JButton buttonYes = new JButton("Yes of course 😝");
    JButton buttonNo = new JButton("NO 👎");

    //Response Panel
    JPanel responsePanel = new JPanel();
    JLabel displayText = new JLabel("");

    public CustomFrame() {

        setTitle("Valentines Day Proposal");
        setSize(500, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 12));

        Font headingFont = new Font("Arial", Font.BOLD, 16);
        Font normalFont = new Font("Arial", Font.PLAIN, 14);

        //Name 
        namePanel.setLayout(new FlowLayout());
        JLabel namePrompt = new JLabel("Enter your name:");
        namePrompt.setFont(normalFont);

        namePanel.add(namePrompt);
        namePanel.add(nameField);
        namePanel.add(btnContinue);

        //Question  
        questionPanel.setLayout(new FlowLayout());
        valentineLabel.setFont(headingFont);

        questionPanel.add(valentineLabel);
        questionPanel.add(buttonYes);
        questionPanel.add(buttonNo);
        questionPanel.setVisible(false);

        //response 
        responsePanel.setLayout(new FlowLayout());
        displayText.setFont(headingFont);

        responsePanel.add(displayText);
        responsePanel.setVisible(true);

        add(namePanel);
        add(questionPanel);
        add(responsePanel);

        btnContinue.addActionListener(this);
        buttonYes.addActionListener(this);
        buttonNo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText().trim();

        //Continue
        if (e.getSource() == btnContinue) {

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your name.");
                return;
            }

            if (name.equalsIgnoreCase("Nkateko")) {
                JOptionPane.showMessageDialog(this, "Nooooo, not my name bra😂");
                return;
            }

            if (!name.equalsIgnoreCase("Praise")) {
                JOptionPane.showMessageDialog(this, "No man, okare this proposal is not for you😐🖕");
                return;
            }

            questionPanel.setVisible(true);
            nameField.setEnabled(false);
            btnContinue.setEnabled(false);
        }

        //yes and no
        if (e.getSource() == buttonYes) {
            displayText.setText("Nxawwwww🥹" + "\nI love you girl💕");
            responsePanel.setVisible(true);
        }
        if (e.getSource() == buttonNo) {
            displayText.setText("Ha why?🥺");
            responsePanel.setVisible(true);

        }

        buttonNo.setEnabled(false);

    }

}
