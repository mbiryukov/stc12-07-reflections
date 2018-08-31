package ru.innopolis.stc12.proxy.annot_proxy;

@Logged
public class MathCounter implements Counter {

    @Override
    public void count() {
        System.out.println("Counting...");
    }
}
