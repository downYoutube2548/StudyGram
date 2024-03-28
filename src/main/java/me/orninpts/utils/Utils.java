package me.orninpts.utils;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

public class Utils {
    public static JFXPanel getBrowserPanel(String videoId) {

        JFXPanel jfxPanel = new JFXPanel();

        Platform.runLater(() -> {
            WebView webView = new WebView();
            jfxPanel.setScene(new Scene(webView));

            webView.getEngine().load("https://www.youtube.com/embed/"+videoId);
        });

        return jfxPanel;
    }
}
