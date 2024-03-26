package me.orninpts.ui;

import me.orninpts.enums.Subject;

import javax.swing.*;
import java.awt.*;

public class SubjectMenu extends JFrame {

    public SubjectMenu(Subject subject) {
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 50, 0));
        add(titlePanel, BorderLayout.NORTH);

        JLabel titleLabel = new JLabel(subject.getDisplayName(), SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titlePanel.add(titleLabel, BorderLayout.CENTER);


    }
}
