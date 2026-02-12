package com.jour.niuke.map的简单应用;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapDemo {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String name = scanner.next();
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Amy");
        map.put(2, "Joe");
        map.put(3, "Tom");
        map.put(4, "Susan");

        //write your code here......
        map.forEach((s,t)->{
            System.out.println(s + ":" + t);
        });
        map.put(5, name);
        map.remove(4);
        map.replace(3,"Tommy");

        System.out.println();
        map.forEach((s,t)->{
            System.out.println(s + ":" + t);
        });
    }
}
