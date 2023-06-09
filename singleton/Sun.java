/******
单例模式样例

*******/

public Class Sun()
{
    private volatile static Sun sun;    //此处只是声明，没有实例化；volatile对静态变量的修饰则能保证变量值在各线程访问时的同步性、唯一性

    private Sun()   //构造方法私有化，JAVA会给每个类隐士创造一个无参构造函数，此处显式创造就避免了隐式的创造
    {

    }

    public static Sun getInstance()
    {
       if(null == sun){
         synchronized(Sun.class)  //同步锁
         if(null == sun)
         {
            sun = new Sun();
         }
       }

       return sun;
    }

}
