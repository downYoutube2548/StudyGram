package me.orninpts.ui;

import me.orninpts.enums.Subject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    public MainMenu() {

        setTitle("Study Gram");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 800);
        setLocationRelativeTo(null);

        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 50, 0));
        add(titlePanel, BorderLayout.NORTH);

        JLabel titleLabel = new JLabel("Study Gram", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titlePanel.add(titleLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 2, 20, 20));
        add(buttonPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 8; i++) {
            JButton button = new JButton("Button " + i);

            System.out.println("test1");

            switch (i) {
                case 1 -> button.addActionListener(e -> new ButtonListener(this, Subject.THAI));
                case 2 -> button.addActionListener(e -> new ButtonListener(this, Subject.MATH));
                case 3 -> button.addActionListener(e -> new ButtonListener(this, Subject.BIOLOGY));
                case 4 -> button.addActionListener(e -> new ButtonListener(this, Subject.CHEMISTRY));
                case 5 -> button.addActionListener(e -> new ButtonListener(this, Subject.PHYSIC));
                case 6 -> button.addActionListener(e -> new ButtonListener(this, Subject.SOCIAL));
                case 7 -> button.addActionListener(e -> new ButtonListener(this, Subject.COMPUTER));
                case 8 -> button.addActionListener(e -> new ButtonListener(this, Subject.ENGLISH));
            }

            buttonPanel.add(button);
        }

        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    private static class ButtonListener implements ActionListener {

        private final JFrame parent;
        private final Subject subject;

        public ButtonListener(JFrame parent, Subject subject) {
            this.parent = parent;
            this.subject = subject;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("EEEEEE");

            parent.setContentPane(new SubjectMenu(subject).getContentPane());
            parent.repaint();
            parent.revalidate();
        }
    }
}