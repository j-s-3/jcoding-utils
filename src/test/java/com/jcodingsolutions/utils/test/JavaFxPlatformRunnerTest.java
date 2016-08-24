package com.jcodingsolutions.utils.test;

import com.jcodingsolutions.utils.javafx.JavaFxPlatformRunner;
import javafx.application.Platform;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Platform.class})
public class JavaFxPlatformRunnerTest {

    JavaFxPlatformRunner javafxPlatformRunner;

    @Before
    public void setUp() throws Throwable {
        mockStatic(Platform.class);
        this.javafxPlatformRunner = new JavaFxPlatformRunner();
    }

    @Test
    public void shouldPassRunnableToPlatformRunLater() {
        Runnable runnable = () -> {

        };
        mockStatic(Platform.class);
        PowerMockito.doNothing().when(Platform.class);
        Platform.runLater(runnable);
        javafxPlatformRunner.run(runnable);
        PowerMockito.verifyStatic();
        Platform.runLater(runnable);
    }
}