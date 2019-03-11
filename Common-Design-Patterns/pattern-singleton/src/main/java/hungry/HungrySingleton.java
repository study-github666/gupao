package hungry;

public class HungrySingleton {
    //1、私有化构造器
    private HungrySingleton(){}
    // 2、创建实例
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    // 3、对外提供获取实例方法
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
