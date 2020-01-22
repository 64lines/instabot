package com.instabot;

import static com.instabot.utils.RobotUtils.keyCombo;
import static com.instabot.utils.RobotUtils.mouseClick;
import static com.instabot.utils.RobotUtils.mouseRightClick;
import static com.instabot.utils.RobotUtils.pressKey;
import static com.instabot.utils.RobotUtils.typeText;

import com.instabot.utils.FileUtils;
import java.awt.*;
import java.awt.event.KeyEvent;

public class InstaRobot
{
    private static final String DIRECTORY = "/Users/julian/Collections/Old pictures/";
    private Robot robot;

    public InstaRobot()
    throws AWTException
    {
        robot = new Robot();
    }

    public void runRobot()
    {
        openInstagram();
        uploadFiles();
    }

    /**
     * Open Instagram
     */
    private void openInstagram()
    {
        openChrome();
        openNewTab();
        browseToInstagram();
        openDeveloperTools();
    }

    /**
     * Upload files.
     */
    private void uploadFiles()
    {
        int pictureNumber = FileUtils.getPictures(DIRECTORY).size();

        for (int i = 0; i < pictureNumber; i++)
        {
            clickUploadFileButton();
            selectFolder();
            selectFile();
            selectFitImageButton();
            clickNext();
            writePhotoDescription();
            clickPublish();
            clickUploadFileButton();
            selectFolder();
            deleteFile();
        }
    }

    /**
     * Open Chome.
     */
    private void openChrome()
    {
        robot.mouseMove(401,799);
        robot.delay(1000);
        robot.mouseMove(401,785);
        mouseClick(robot);

        robot.delay(500);
        robot.mouseMove(401,585);
        mouseClick(robot);
    }

    /**
     * Opening a new tab
     */
    private void openNewTab()
    {
        keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_T);
        robot.delay(3000);
    }

    /**
     * Opening https://www.instagram.com/
     */
    private void browseToInstagram()
    {
        typeText(robot, "instagram.com");
        robot.delay(1000);
        pressKey(robot, KeyEvent.VK_ENTER);
    }

    /**
     * Opening developer tools.
     */
    private void openDeveloperTools()
    {
        robot.delay(3000);
        keyCombo(robot, KeyEvent.VK_ALT, KeyEvent.VK_META, KeyEvent.VK_I);
        robot.delay(8000);
        keyCombo(robot, KeyEvent.VK_META, KeyEvent.VK_R);
        robot.delay(3000);
    }

    /**
     * Select upload file button.
     */
    private void clickUploadFileButton()
    {
        robot.mouseMove(442,760);
        mouseClick(robot);
        robot.delay(3000);
    }

    /**
     * Select folder.
     */
    private void selectFolder()
    {
        robot.mouseMove(287,214);
        mouseClick(robot);
        robot.delay(3000);
    }

    /**
     * Select file
     */
    private void selectFile()
    {
        robot.mouseMove(504,174);
        mouseClick(robot);
        robot.delay(1000);
        pressKey(robot, KeyEvent.VK_ENTER);
    }

    /**
     * Right Click file.
     */
    private void deleteFile()
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
     * Select Fit Image Button.
     */
    private void selectFitImageButton()
    {
        robot.delay(3000);
        robot.mouseMove(314,537);
        mouseClick(robot);
    }

    /**
     * Click on next.
     */
    private void clickNext()
    {
        robot.delay(1000);
        robot.mouseMove(586,225);
        mouseClick(robot);
    }

    /**
     * Click on publish
     */
    private void clickPublish()
    {
        robot.delay(1000);
        robot.mouseMove(586,225);
        mouseClick(robot);
        robot.delay(10000);
    }



    /**
     * Write Description.
     */
    private void writePhotoDescription()
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
