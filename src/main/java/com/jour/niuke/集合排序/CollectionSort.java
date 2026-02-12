package com.jour.niuke.集合排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer1 = new Customer("小明",scanner.nextInt());
        Customer customer2 = new Customer("小军",scanner.nextInt());
        Customer customer3 = new Customer("小红",scanner.nextInt());
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        //write your code here......
        /*for (int i = 0; i < customers.size(); i++) {
            for (int j = i; j < customers.size(); j++) {
                if (customers.get(i).compareTo(customers.get(j)) < 0) {
                    Customer temp = customers.get(i);
                    customers.set(i, customers.get(j));
                    customers.set(j, temp);
                }
            }
        }*/

        //进阶     利用compareTo来控制升降序
        Collections.sort( customers);

        System.out.println(customers);

    }
}

class Customer implements Comparable<Customer>{
    private String name;
    private int consumption;

    public Customer(String name, int consumption) {
        this.name = name;
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", consumption=" + consumption +
                '}';
    }

    @Override
    public int compareTo(Customer other) {
        //升序
        //return this.consumption - other.consumption;

        //降序
        return other.consumption - this.consumption;
    }

    //write your code here......
}
