/******
原型模式(prototype)

从类到对象叫作“创建”，而由本体对象至副本对象则叫作“克隆”，当需要创建多个类似复杂对象时，可以考虑用原型模式。
克隆操作时Java虚拟机会进行内存操作，直接拷贝原型对象数据流生成新的副本对象，不会触发一些多余的复杂操作(如类加载、实例化、初始化等)

克隆属于一种浅拷贝，只复制原始类型的值，如int类型，但是引用类型，如类的声明，不会被复制

*******/

public class EnemyPlane implements Cloneable{

  private Bullet bullet;     //这是一个声明，引用，没有实例化
  private int x;
  private int y = 0;

  public EnemyPlane(int x, Bullet bullet){
    this.x = x;
    this.bullet = bullet;
  }

  public setBullet(Bullet bullet){
    this.bullet = bullet;
  }

  @Override
  protected EnemyPlane clone() throws CloneNotSupportedException {
      EnemyPlane clonePlane = (EnemyPlane) super.clone();  //克隆敌机
      clonePlane.setBullet(this.bullet.clone())
      return clonePlane;
  }
}
