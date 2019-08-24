package models;

/**
 * Created by Konkanok on 7/21/2019.
 */
public class Animal {
    private String name;
    private boolean gender;
    private int age;
    private String type;
    private String color;

    //constructor
    public Animal(){

    }
    public Animal(String name,boolean gender,int sge,String type,String color){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.type=type;
        this.color=color;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(boolean gender)
    {
        this.gender = gender;
    }

    public String getGender() {
        if (gender==true)
            return "เพศผู้";
        else
            return  "เพศเมีย";
    }

}
