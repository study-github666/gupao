package lazy;

public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton(){}
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
