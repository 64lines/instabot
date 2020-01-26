package com.instabot;

import static com.instabot.utils.InstagramRobotUtils.browseToInstagram;
import static com.instabot.utils.InstagramRobotUtils.openChrome;
import static com.instabot.utils.InstagramRobotUtils.openNewTab;
import static com.instabot.utils.InstagramRobotUtils.pressingDown;
import static com.instabot.utils.InstagramRobotUtils.selectExplore;
import static com.instabot.utils.RobotUtils.keyCombo;
import static com.instabot.utils.RobotUtils.mouseClick;
import static com.instabot.utils.RobotUtils.mouseRightClick;
import static com.instabot.utils.RobotUtils.pressKey;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ScrapperBot extends Bot
{
    private static final int NUMBER_OF_ENTRIES = 50;

    ScrapperBot()
    throws AWTException
    {
        super();
    }

    @Override
    public void runBot()
    {
        openChrome(robot);
        openNewTab(robot);
        browseToInstagram(robot);
        selectExplore(robot);

        // Selecting first post
        selectFirstPost(robot);

        // Opening profile
        openProfile(robot);

        // Opening VS Code
        openVSCode(robot);
        createNewFile(robot);
        openChrome(robot);

        for (int i = 0; i < NUMBER_OF_ENTRIES; i++)
        {
            // Copying Data
            copyUrl(robot);
            openVSCode(robot);
            pasteData(robot);

            openChrome(robot);
            copyPosts(robot);
            openVSCode(robot);
            pasteData(robot);

            openChrome(robot);
            copyFollowers(robot);
            openVSCode(robot);
            pasteData(robot);

            openChrome(robot);
            copyFollowing(robot);
            openVSCode(robot);
            pasteData(robot);
            pressKey(robot, KeyEvent.VK_BACK_SPACE);
            robot.delay(500);
            pressKey(robot, KeyEvent.VK_ENTER);

            // Back to explore
            openChrome(robot);
            robot.delay(1000);
            robot.mouseMove(92, 387);
            mouseClick(robot);

            backToExplore(robot);
            robot.delay(3000);
            keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_R);
            robot.delay(6000);

            // Selecting first post
            selectFirstPost(robot);

            openProfile(robot);
        }
    }

    /**
     * Select first post.
     * @param robot
     */
    private static void selectFirstPost(Robot robot)
    {
        pressingDown(robot, 3);
        robot.mouseMove(357, 496);
        mouseClick(robot);
    }

    /**
     * Open profile.
     * @param robot
     */
    private static void openProfile(Robot robot)
    {
        robot.delay(3000);
        pressKey(robot, KeyEvent.VK_TAB);
        robot.delay(1000);
        pressKey(robot, KeyEvent.VK_TAB);
        pressKey(robot, KeyEvent.VK_ENTER);
        robot.delay(1000);
    }

    /**
     * Opening VS Code.
     * @param robot
     */
    private static void openVSCode(Robot robot)
    {
        robot.delay(1000);
        robot.mouseMove(361, 799);
        robot.delay(1000);
        robot.mouseMove(361, 785);
        mouseClick(robot);
        robot.delay(500);
    }

    /**
     * Creating a new file.
     * @param robot
     */
    private static void createNewFile(Robot robot)
    {
        keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_N);
        robot.delay(50);
    }


    /**
     * Paste data.
     *
     * @param robot
     */
    private static void pasteData(Robot robot)
    {
        keyCombo(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_2);
        keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_V);
        keyCombo(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_2);
        pressKey(robot, KeyEvent.VK_COMMA);
        robot.delay(1000);
    }

    /**
     * Copy posts.
     * @param robot
     */
    private static void copyPosts(Robot robot)
    {
        robot.delay(3000);
        robot.mouseMove(492, 309);
        mouseRightClick(robot);
        robot.delay(1000);
        pressingDown(robot, 2);
        pressKey(robot, KeyEvent.VK_ENTER);
    }

    /**
     * Copy followers
     * @param robot
     */
    private static void copyFollowers(Robot robot)
    {
        robot.delay(3000);
        robot.mouseMove(613, 309);
        mouseRightClick(robot);
        robot.delay(1000);
        pressingDown(robot, 7);
        pressKey(robot, KeyEvent.VK_ENTER);
    }

    /**
     * Copy following
     * @param robot
     */
    private static void copyFollowing(Robot robot)
    {
        robot.delay(3000);
        robot.mouseMove(746, 309);
        mouseRightClick(robot);
        robot.delay(1000);
        pressingDown(robot, 7);
        pressKey(robot, KeyEvent.VK_ENTER);
    }

    /**
     * Copy url
     * @param robot
     */
    private static void copyUrl(Robot robot)
    {
        robot.delay(3000);
        robot.mouseMove(409, 89);
        mouseRightClick(robot);
        robot.delay(1000);
        pressingDown(robot, 6);
        pressKey(robot, KeyEvent.VK_ENTER);
    }

    /**
     * Back to explore.
     * @param robot
     */
    private static void backToExplore(Robot robot)
    {
        robot.delay(3000);
        keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_LEFT);
        robot.delay(3000);
        keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_LEFT);
    }
}
