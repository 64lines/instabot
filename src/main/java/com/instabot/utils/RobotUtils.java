package com.instabot.utils;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class RobotUtils
{
    public static Map<String, Integer> getKeyMap() {
        Map<String, Integer> keyMap = new HashMap<>();
        keyMap.put("a", KeyEvent.VK_A);
        keyMap.put("b", KeyEvent.VK_B);
        keyMap.put("c", KeyEvent.VK_C);
        keyMap.put("d", KeyEvent.VK_D);
        keyMap.put("e", KeyEvent.VK_E);
        keyMap.put("f", KeyEvent.VK_F);
        keyMap.put("g", KeyEvent.VK_G);
        keyMap.put("h", KeyEvent.VK_H);
        keyMap.put("i", KeyEvent.VK_I);
        keyMap.put("j", KeyEvent.VK_J);
        keyMap.put("k", KeyEvent.VK_K);
        keyMap.put("l", KeyEvent.VK_L);
        keyMap.put("m", KeyEvent.VK_M);
        keyMap.put("n", KeyEvent.VK_N);
        keyMap.put("o", KeyEvent.VK_O);
        keyMap.put("p", KeyEvent.VK_P);
        keyMap.put("q", KeyEvent.VK_Q);
        keyMap.put("r", KeyEvent.VK_R);
        keyMap.put("s", KeyEvent.VK_S);
        keyMap.put("t", KeyEvent.VK_T);
        keyMap.put("u", KeyEvent.VK_U);
        keyMap.put("v", KeyEvent.VK_V);
        keyMap.put("w", KeyEvent.VK_W);
        keyMap.put("x", KeyEvent.VK_X);
        keyMap.put("y", KeyEvent.VK_Y);
        keyMap.put("z", KeyEvent.VK_Z);
        keyMap.put("1", KeyEvent.VK_1);
        keyMap.put("2", KeyEvent.VK_2);
        keyMap.put("3", KeyEvent.VK_3);
        keyMap.put("4", KeyEvent.VK_4);
        keyMap.put("5", KeyEvent.VK_5);
        keyMap.put("6", KeyEvent.VK_6);
        keyMap.put("7", KeyEvent.VK_7);
        keyMap.put("8", KeyEvent.VK_8);
        keyMap.put("9", KeyEvent.VK_9);
        keyMap.put("0", KeyEvent.VK_0);
        keyMap.put(".", KeyEvent.VK_PERIOD);
        keyMap.put(",", KeyEvent.VK_COMMA);
        keyMap.put(" ", KeyEvent.VK_SPACE);

        return keyMap;
    }
    public static void keyCombo(Robot robot, int key1, int key2)
    {
        robot.keyPress(key1);
        robot.delay(500);
        robot.keyPress(key2);
        robot.delay(500);
        robot.keyRelease(key1);
        robot.delay(500);
        robot.keyRelease(key2);
        robot.delay(500);
    }

    public static void keyCombo(Robot robot, int key1, int key2, int key3)
    {
        robot.keyPress(key1);
        robot.delay(200);
        robot.keyPress(key2);
        robot.delay(200);
        robot.keyPress(key3);
        robot.delay(200);
        robot.keyRelease(key1);
        robot.keyRelease(key2);
        robot.keyRelease(key3);
        robot.delay(200);
    }

    public static void mouseClick(Robot robot)
    {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void mouseRightClick(Robot robot)
    {
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    public static void pressKey(Robot robot, int key)
    {
        robot.keyPress(key);
        robot.delay(50);
    }

    public static void typeText(Robot robot, String text)
    {
        String lowerText = text.toLowerCase();

        for (Character character : lowerText.toCharArray())
        {
            int key = getKeyMap().get(character.toString());
            pressKey(robot, key);
        }
    }
}
