package com.jcodingsolutions.utils.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultThreadSleeper implements ThreadSleeper {

    private static final Logger LOG = Logger.getLogger(DefaultThreadSleeper.class.getName());

    @Override
    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            LOG.log(Level.SEVERE, "", e);
        }
    }
}
