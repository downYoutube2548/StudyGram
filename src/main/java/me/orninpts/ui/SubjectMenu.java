package me.orninpts.ui;

import me.orninpts.enums.Subject;
import me.orninpts.utils.Utils;

import javax.swing.*;
import java.awt.*;

public class SubjectMenu extends JFrame {

    public SubjectMenu(JFrame parent, Subject subject) {
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Title Panel
        JPanel rightSidePanel = new JPanel(new BorderLayout());
        rightSidePanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 50, 0));
        JLabel titleLabel = new JLabel(subject.getDisplayName(), SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        rightSidePanel.add(titleLabel, BorderLayout.NORTH);

        rightSidePanel.add(Utils.getBrowserPanel("fDYuTDlu2XI"), BorderLayout.CENTER);

        mainPanel.add(rightSidePanel, BorderLayout.CENTER);

        JPanel leftSidePanel = new JPanel(new BorderLayout());

        JPanel subjectPanel = new JPanel(new BorderLayout());
        subjectPanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 50, 0));
        JLabel subjectLable = new JLabel("Subjects", SwingConstants.CENTER);
        subjectLable.setFont(new Font("Arial", Font.BOLD, 40));
        subjectPanel.add(subjectLable, BorderLayout.NORTH);
        leftSidePanel.add(subjectPanel, BorderLayout.NORTH);

        // Buttons Panel
        JPanel buttonsPanel = new JPanel(new GridLayout(0, 1, 20, 20)); // Use 0 rows to accommodate varying number of buttons
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100)); // Add space around buttons

        for (int i = 0; i < 8; i++) { // Increased number of buttons for demonstration
            JButton button = new JButton("Button: " + (i + 1));
            button.setPreferredSize(new Dimension(300, 70)); // Set preferred width
            button.setFont(new Font("Arial", Font.PLAIN, 20)); // Set font size
            buttonsPanel.add(button);
        }

        JScrollPane scrollPane = new JScrollPane(buttonsPanel); // Add buttonsPanel to JScrollPane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Always show vertical scrollbar

        leftSidePanel.add(scrollPane, BorderLayout.CENTER);

        mainPanel.add(leftSidePanel, BorderLayout.WEST);

        // Adding mainPanel to the frame
        add(mainPanel);

        // Set frame properties
        parent.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}