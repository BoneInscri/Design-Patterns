package org.hdbone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum EnumSingle {
    INSTANCE;

    public EnumSingle getInstance()
    {
        return INSTANCE;
    }
}

class Test{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EnumSingle instance1=EnumSingle.INSTANCE;
        Constructor<EnumSingle> constructor=EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        EnumSingle instance2=constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}