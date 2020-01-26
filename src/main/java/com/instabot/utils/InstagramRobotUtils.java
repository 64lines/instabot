package com.instabot.utils;

import static com.instabot.utils.RobotUtils.keyCombo;
import static com.instabot.utils.RobotUtils.mouseClick;
import static com.instabot.utils.RobotUtils.pressKey;
import static com.instabot.utils.RobotUtils.typeText;

import java.awt.*;
import java.awt.event.KeyEvent;

public class InstagramRobotUtils
{
    /**
     * Open Chome.
     * @param robot
     */
    public static void openChrome(Robot robot)
    {
        robot.mouseMove(401,799);
        robot.delay(1000);
        robot.mouseMove(401,785);
        mouseClick(robot);

        robot.delay(500);
        robot.mouseMove(401,585);
    }

    /**
     * Opening https://www.instagram.com/
     * @param robot
     */
    public static void browseToInstagram(Robot robot)
    {
        typeText(robot, "instagram.com");
        robot.delay(1000);
        pressKey(robot, KeyEvent.VK_ENTER);
    }

    /**
     * Opening a new tab
     * @param robot
     */
    public static void openNewTab(Robot robot)
    {
        keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_T);
        robot.delay(3000);
    }

    /**
     * Select explore.
     * @param robot
     */
    public static void selectExplore(Robot robot)
    {
        robot.delay(4000);
        robot.mouseMove(980, 141);
        mouseClick(robot);
        robot.delay(3000);
    }

    /**
     * Pressing down.
     * @param robot
     * @param times
     */
    public static void pressingDown(Robot robot, int times)
    {
        for (int i = 0; i < times; i++)
        {
            pressKey(robot, KeyEvent.VK_DOWN);
            robot.delay(50);
        }
    }
}
