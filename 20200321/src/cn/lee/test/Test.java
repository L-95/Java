package cn.lee.test;
//override 方法重写

/*一：
*当父类中的方法已经无法满足子类的业务需求，
* 子类有必要将父类中继承过来的同名方法进行重新编写，
* 这个重新编写的过程成为方法重写/方法覆盖
* */

/*二：
*当代码满足什么条件的时候 会构成方法的重写？
*  1.方法重写发生在具有继承关系的父类和子类之间
*  2.返回值类型相同（返回值类型如果是：
*                   子类返回值类型是父类返回值类型的子类也构成重写，只不过字面不同），
*  方法名相同，形参列表相同
*  3.访问权限只能更高，不能更低
*  4.抛出异常只能更过，不能更少
*  */

/*三：
*方法重写时尽量复制粘贴，避免手动输入出现误差，导致重写失败
* */

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal("动物");
        a.move();
        a.sleep();
        a.eat();
        a.paly();

        System.out.println(a.test());
        //返回值类型如果是：
        //子类返回值类型是父类返回值类型的子类也构成重写，只不过字面不同

        Cat c = new Cat("猫");
        c.move();
        c.sleep();
        c.eat();
        c.paly();

        System.out.println(c.test());
        //返回值类型如果是：
        //子类返回值类型是父类返回值类型的子类也构成重写，只不过字面不同

        Bird b = new Bird("鹰");
        b.move();
        b.sleep();
        b.eat();
        b.paly();
    }
}