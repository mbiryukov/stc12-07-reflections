package ru.innopolis.stc12.proxy.first_proxy;

public class JavaTrainer implements Trainer {
    @Override
    public void teach() {
        System.out.println("Java is so complicated");
    }

    @Override
    public void eat() {
        System.out.println("I like to eat mango");
    }

    @Override
    public void talk() {
        System.out.println("Where's your homework?");
    }
}
