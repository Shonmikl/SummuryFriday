package org.example._2023_09_29.patternProxy;

public interface Checkable {
    void check();
}

class RealController implements Checkable {

    @Override
    public void check() {
        System.out.println("RealController check()");
    }
}

class ProxyController implements Checkable {
    private Checkable checkable;

    public ProxyController(Checkable checkable) {
        this.checkable = checkable;
    }

    @Override
    public void check() {
        System.out.println("Proxy logging........");
        checkable.check();
    }
}

class Main {
    public static void main(String[] args) {
        Checkable real = new RealController();
        Checkable proxy = new ProxyController(real);

        proxy.check();
    }
}