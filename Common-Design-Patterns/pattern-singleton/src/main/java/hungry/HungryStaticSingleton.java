package hungry;

public class HungryStaticSingleton {
    //1、私有化构造器
    private HungryStaticSingleton(){}
    // 2、静态代码块创建实例
    private static final HungryStaticSingleton hungryStaticSingleton;
    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }
    // 3、对外提供获取实例方法
    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
