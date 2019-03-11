import lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        //LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        //System.out.println(instance);
        Class<?> clazz = LazyInnerClassSingleton.class;
        try {
            Constructor<?> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            //Object o2 = c.newInstance();
            //System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
