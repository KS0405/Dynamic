package models;

/**
 * Created by Konkanok on 7/21/2019.
 */
public class Shoes {
    private String name;
    private String color;
    private int size;
    private String brand;
    private boolean gender;
    private double price;

    public Shoes() {}

    public Shoes(String name, String color, int size, String brand, boolean gender, double price){
            this.name=name;
            this.color=color;
            this.size=size;
            this.brand=brand;
            this.gender=gender;
            this.price=price;
        }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String getGender() {
        if (gender==true)
            return "ชาย";
        else
            return  "หญิง";
    }

    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
