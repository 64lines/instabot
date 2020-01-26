package com.instabot;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;

public class MouseTracker
{
    public static final int SECONDS = 30;

    public static void main(String args[])
    throws InterruptedException
    {
        MouseTracker.trackMouse();
    }

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
            System.out.println("robot.mouseMove(" + point.x + ", " + point.y + ");");
        }
    }
}
