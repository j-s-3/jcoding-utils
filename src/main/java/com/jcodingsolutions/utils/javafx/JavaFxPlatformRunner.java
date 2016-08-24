package com.jcodingsolutions.utils.javafx;

import javafx.application.Platform;

public class JavaFxPlatformRunner {
    public void run(Runnable runnable) {
        Platform.runLater(runnable);
    }
}
