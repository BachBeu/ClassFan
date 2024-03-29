package com.Bach;

public class Fan {
    private int speed;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "Blue";


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(this.isOn())
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String toString(){
        if(this.on){
            return "Quạt " + " Tốc độ: " + this.speed +
                    " Màu sắc: " + this.color + " Bán kính là: "
                    + this.radius + " Fan is on";
        }else{
            return "Quạt " +
                    " Màu sắc: " + this.color + " Bán kính là: "
                    + this.radius + " Fan is off";
        }
    }
}
