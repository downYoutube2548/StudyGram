package me.orninpts.ui;

import me.orninpts.enums.Subject;

import javax.swing.*;
import java.awt.*;

public class SubjectMenu extends JFrame {

    public SubjectMenu(JFrame parent, Subject subject) {

        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 50, 0));
        add(titlePanel, BorderLayout.NORTH);

        JLabel titleLabel = new JLabel(subject.getDisplayName(), SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titlePanel.add(titleLabel, BorderLayout.NORTH);

        JPanel linePanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw a square with side length 50 at position (10, 50)
                g.setColor(Color.WHITE);
                g.fillRect(20, 0, 600, 1000);
            }
        };

        add(linePanel);

        parent.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
