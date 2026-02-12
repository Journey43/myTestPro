package com.jour.niuke.面向对象;

import java.util.Scanner;

//验证年龄
public class VerificationAge {
    public static void main(String[] args) {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            p.setAge(age);
            System.out.println(p.getAge());
        }
    }

}

class Person {

    private int age;

    //write your code here......
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }


}
