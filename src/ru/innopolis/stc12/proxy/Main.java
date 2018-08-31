package ru.innopolis.stc12.proxy;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Capucin abou = new Capucin(50);
        Class<Capucin> clazz = (Class<Capucin>) abou.getClass();
        //ReflectionUtils.printClass(clazz);

        Capucin mrJenkins = new Capucin(10, 100, 30);
        Field footSizeField = mrJenkins.getClass().getDeclaredField("footSize");
        footSizeField.setAccessible(true);
        System.out.println(footSizeField.get(mrJenkins));
        footSizeField.set(mrJenkins, 32);
        System.out.println(footSizeField.get(mrJenkins));

        Field tailLengthField = mrJenkins.getClass().getDeclaredField("tailLength");
        tailLengthField.setAccessible(true);
        tailLengthField.set(mrJenkins, 1000);
        System.out.println(tailLengthField.get(mrJenkins));
    }
}
