package com.jour.niuke.面向对象.实现抽象方法;

import java.util.Scanner;

public class 父类用子类 {
    public static void main(String[] args) {
        // Sub是需要你定义的子类
        Base base = new Sub();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            base.setX(x);
            base.setY(y);
            System.out.println(base.calculate());
        }
    }


}

abstract class Base {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int calculate() {
        if (avg() == 0) {
            return 0;
        } else {
            return sum() / avg();
        }
    }

    /**
     * 返回x和y的和
     */
    public abstract int sum();

    /**
     * 返回x和y的平均值
     */
    public abstract int avg();

}

class Sub extends Base {
    /*private int x;
    private int y;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }*/
    //倘若子类重写了get与set,那么base.setX(x);和base.setY(y);就会以子类重写的为准,父类就接受不到
    //子类没重写，则去父类找，从而父类接受

    /* getX()
    * (1)Sub 中有没有重写 getX()？

      (2)❌ 没有

      (3)去父类 Base 找

      (4)✅ 找到 Base.getX()
    * */


    //write your code here......
    @Override
    public int sum(){
        System.out.println("子类的getX()：" + getX());
        return super.getX() + super.getY();
    }

    @Override
    public int avg() {
        return sum()/2;
    }

}
