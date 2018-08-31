package ru.innopolis.stc12.proxy;

public class Main {
    public static void main(String[] args) {
        Capucin abou = new Capucin(50);
        Class<Capucin> clazz = (Class<Capucin>) abou.getClass();
        ReflectionUtils.printClass(clazz);


    }
}
