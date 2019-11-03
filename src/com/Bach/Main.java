package com.Bach;

public class Main {

    public static void main(String[] args) {
        final int Slow = 1;
        final int Medium = 2;
        final int Fast = 3;
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fast);
        fan1.setRadius(6);
        fan1.setColor("Red");
        System.out.println(fan1.toString());
    }
}
