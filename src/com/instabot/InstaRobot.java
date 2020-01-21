package com.instabot;

import static com.instabot.RobotUtils.keyCombo;
import static com.instabot.RobotUtils.mouseClick;
import static com.instabot.RobotUtils.mouseRightClick;
import static com.instabot.RobotUtils.pressKey;
import static com.instabot.RobotUtils.typeText;

import java.awt.*;
import java.awt.event.KeyEvent;

public class InstaRobot
{
    private static final int NUMBER_OF_POST = 5;

    public static void runRobot()
    throws AWTException
    {
        Robot robot = new Robot();

        // Steps
        openGoogleChrome(robot);
        openNewTab(robot);
        browseToInstagram(robot);
        openDeveloperTools(robot);

        for (int i = 0; i < NUMBER_OF_POST; i++)
        {
            clickUploadFileButton(robot);
            changeFormat(robot);
            selectFolder(robot);
            selectFile(robot);
            selectFitImageButton(robot);
            clickNext(robot);
            writePhotoDescription(robot);
            clickPublish(robot);
            clickUploadFileButton(robot);
            selectFolder(robot);
            deleteFile(robot);
        }
    }

    /**
     * Opening Chrome
     * @param robot
     */
    private static void openGoogleChrome(Robot robot)
    {
        keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_SPACE);
        robot.delay(2000);
        typeText(robot, "google chrome");
        pressKey(robot, KeyEvent.VK_ENTER);
        robot.delay(3000);
    }

    /**
     * Opening a new tab
     * @param robot
     */
    private static void openNewTab(Robot robot)
    {
        robot.mouseMove(446,480);
        keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_T);
        robot.delay(3000);
    }

    /**
     * Opening Instagram
     * @param robot
     */
    private static void browseToInstagram(Robot robot)
    {
        typeText(robot, "instagram.com");
        robot.delay(1000);
        pressKey(robot, KeyEvent.VK_ENTER);
    }

    /**
     * Opening developer tools
     * @param robot
     */
    private static void openDeveloperTools(Robot robot)
    {
        robot.delay(3000);
        keyCombo(robot, KeyEvent.VK_ALT, KeyEvent.VK_META, KeyEvent.VK_I);
        robot.delay(5000);
        keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_R);
        robot.delay(3000);
    }

    /**
     * Select upload file button
     * @param robot
     */
    private static void clickUploadFileButton(Robot robot)
    {
        robot.mouseMove(442,760);
        mouseClick(robot);
        robot.delay(3000);
    }

    /**
     * Change format
     * @param robot
     */
    private static void changeFormat(Robot robot)
    {
        robot.mouseMove(306,499);
        mouseClick(robot);
        robot.delay(500);
        robot.mouseMove(650,451);
        mouseClick(robot);
        robot.delay(500);
        pressKey(robot, KeyEvent.VK_DOWN);
        pressKey(robot, KeyEvent.VK_ENTER);
        robot.delay(500);
    }

    /**
     * Select folder
     * @param robot
     */
    private static void selectFolder(Robot robot)
    {
        robot.mouseMove(287,214);
        mouseClick(robot);
        robot.delay(3000);
    }

    /**
     * Select file
     * @param robot
     */
    private static void selectFile(Robot robot)
    {
        robot.mouseMove(504,174);
        mouseClick(robot);
        robot.delay(1000);
        pressKey(robot, KeyEvent.VK_ENTER);
    }

    /**
     * Right Click file
     * @param robot
     */
    private static void deleteFile(Robot robot)
    {
        robot.mouseMove(504,174);
        mouseRightClick(robot);
        robot.delay(1000);
        pressKey(robot, KeyEvent.VK_DOWN);
        robot.delay(200);
        pressKey(robot, KeyEvent.VK_DOWN);
        pressKey(robot, KeyEvent.VK_ENTER);
        robot.delay(1000);
        pressKey(robot, KeyEvent.VK_ESCAPE);
        robot.delay(3000);
    }

    /**
     * Select Fit Image Button
     * @param robot
     */
    private static void selectFitImageButton(Robot robot)
    {
        robot.delay(3000);
        robot.mouseMove(314,537);
        mouseClick(robot);
    }

    /**
     * Click on next
     * @param robot
     */
    private static void clickNext(Robot robot)
    {
        robot.delay(1000);
        robot.mouseMove(586,225);
        mouseClick(robot);
    }

    /**
     * Click on publish
     * @param robot
     */
    private static void clickPublish(Robot robot)
    {
        robot.delay(1000);
        robot.mouseMove(586,225);
        mouseClick(robot);
        robot.delay(10000);
    }



    /**
     * Write Description
     * @param robot
     */
    private static void writePhotoDescription(Robot robot)
    {
        robot.delay(3000);
        robot.mouseMove(352,274);
        mouseClick(robot);
        robot.delay(1000);
        keyCombo(robot, KeyEvent.VK_ALT, KeyEvent.VK_3);
        typeText(robot, "vintage ");
        keyCombo(robot, KeyEvent.VK_ALT, KeyEvent.VK_3);
        typeText(robot, "nostalgia ");
        keyCombo(robot, KeyEvent.VK_ALT, KeyEvent.VK_3);
        typeText(robot, "tbt ");
        keyCombo(robot, KeyEvent.VK_ALT, KeyEvent.VK_3);
        typeText(robot, "retro ");
        keyCombo(robot, KeyEvent.VK_ALT, KeyEvent.VK_3);
        typeText(robot, "60s ");
        keyCombo(robot, KeyEvent.VK_ALT, KeyEvent.VK_3);
        typeText(robot, "70s ");
        keyCombo(robot, KeyEvent.VK_ALT, KeyEvent.VK_3);
        typeText(robot, "80s ");
    }
}
