package com.notify.main;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Notify {
    public static void main(String[] args) {
        schedule("Mnk Blink your EYES", "blink for 20 seconds", 1000 * 60 * 20);
        schedule("Mnk Neck Exercise", "Just flip neck with hands together", 1000 * 60 * 60);
    }

    public static void schedule(String caption, String text, long delay) {
        try {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().createImage("D:\\icon.png");
            TrayIcon trayIcon = new TrayIcon(image, "Reminder");
            trayIcon.setImageAutoSize(true);
            trayIcon.setToolTip("Let blink your eye");
            tray.add(trayIcon);
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    trayIcon.displayMessage(caption, text, TrayIcon.MessageType.ERROR);
                }
            }, delay);
        } catch (AWTException awtException) {
            awtException.printStackTrace();
        }
    }
}
