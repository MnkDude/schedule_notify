package com.notify.main;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Notify {
    public static void main(String[] args) throws AWTException {
        SystemTray tray = SystemTray.getSystemTray();
        Image image = Toolkit.getDefaultToolkit().createImage("D:\\icon.png");
        TrayIcon trayIcon = new TrayIcon(image, "Reminder");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("Let blink your eye");
        tray.add(trayIcon);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                    trayIcon.displayMessage("Mnk Blink your EYES", "blink for 20 seconds", TrayIcon.MessageType.ERROR);
            }
        }, 1000 * 60 * 20);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                    trayIcon.displayMessage("Mnk Neck Exercise", "Just flip neck with hands together", TrayIcon.MessageType.ERROR);
            }
        }, 1000 * 60 * 60);
    }
}
