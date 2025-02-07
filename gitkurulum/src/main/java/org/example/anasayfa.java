package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class anasayfa implements ActionListener {
    JFrame frame = new  JFrame();
    JButton button = new JButton("profili böster");


    public  anasayfa(){
        button.addActionListener(this);
        button.setBounds(200,200,200,200);
        frame.add(button);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("anasayfa");
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
