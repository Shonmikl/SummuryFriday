package org.example._2023_10_06;

public class MtEx4 {
    private static final Object LOCK = new Object();

    synchronized void mobileCall() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("Mobile call start " + this);
            Thread.sleep(1500);
            System.out.println("Mobile call end");
        }
    }

    synchronized void whatsAppCall() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("WhatsApp call start " + this);
            Thread.sleep(2500);
            System.out.println("WhatsApp call end");
        }
    }

    synchronized void telegramCall() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("Telegram call start " + this);
            Thread.sleep(900);
            System.out.println("Telegram call end");
        }
    }

    public static void main(String[] args) {
        Thread threadMobile = new Thread(new MobileImpl());
        Thread threadWhatsApp = new Thread(new WhatsAppImpl());
        Thread threadTelegram = new Thread(new TelegramImpl());

        threadMobile.start();
        threadWhatsApp.start();
        threadTelegram.start();
    }
}

class MobileImpl implements Runnable {

    @Override
    public void run() {
        try {
            new MtEx4().mobileCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class WhatsAppImpl implements Runnable {

    @Override
    public void run() {
        try {
            new MtEx4().whatsAppCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class TelegramImpl implements Runnable {

    @Override
    public void run() {
        try {
            new MtEx4().telegramCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}