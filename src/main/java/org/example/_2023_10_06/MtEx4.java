package org.example._2023_10_06;

public class MtEx4 {
    void mobileCall() throws InterruptedException {
        System.out.println("Mobile call start");
        Thread.sleep(1500);
        System.out.println("Mobile call end");
    }

    void whatsAppCall() throws InterruptedException {
        System.out.println("WhatsApp call start");
        Thread.sleep(2500);
        System.out.println("WhatsApp call end");
    }

    void telegramCall() throws InterruptedException {
        System.out.println("Telegram call start");
        Thread.sleep(900);
        System.out.println("Telegram call end");
    }

    public static void main(String[] args) {
        Thread threadMobile = new Thread(new MobileImpl());
        Thread threadWhatsApp = new Thread(new WhatsAppImpl());
        Thread threadTelegram = new Thread(new TelegramImpl());
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