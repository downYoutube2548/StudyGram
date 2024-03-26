package me.orninpts;

import me.orninpts.ui.MainMenu;

import javax.swing.*;

public class StudyGram {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainMenu frame = new MainMenu();
            frame.setVisible(true);
        });
    }
}
