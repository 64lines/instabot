package com.instabot;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MouseTracker
{
    public static final int SECONDS = 30;

    /**
     * Tracks the mouse for 30 seconds.
     *
     * @throws InterruptedException
     */
    public static void trackMouse()
    throws InterruptedException
    {
        for (int i = 0; i < SECONDS; i++)
        {
            TimeUnit.SECONDS.sleep(1);
            Point point = MouseInfo.getPointerInfo().getLocation();
            System.out.println(point.x + "," + point.y);
        }
    }
}
